class MyLinkedList {
public:
    /** Initialize your data structure here. */
    int value;
    MyLinkedList *next, *head;
    MyLinkedList() {
        this->head = NULL;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    int get(int index) {
        MyLinkedList* current = this->head;
        int count = 0;
        while (current != NULL) {
            if (index == count) {
                return current->value;
            }
            count++;
            current = current->next;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    void addAtHead(int val) {
        MyLinkedList *linked_list = new MyLinkedList();
        linked_list->value = val;
        linked_list->next = this->head;
        this->head = linked_list;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    void addAtTail(int val) {
        MyLinkedList *linked_list = new MyLinkedList();
        linked_list->value = val;
        linked_list->next = NULL;
        MyLinkedList* current = this->head;
        while (current != NULL) {
            if (current->next == NULL) {
                current->next = linked_list;
                break;
            }
            current = current->next;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    void addAtIndex(int index, int val) {
        MyLinkedList *linked_list = new MyLinkedList();
        linked_list->value = val;
        MyLinkedList* current = this->head;
        int count = 0;
        if (index == 0) {
            linked_list->next = this->head;
            this->head = linked_list;
        } else {
            while (current != NULL) {
                if (count == index - 1) {
                    linked_list->next= current->next;
                    current->next = linked_list;
                    break;
                }
                count++;
                current = current->next;
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    void deleteAtIndex(int index) {
        MyLinkedList* current = this->head;
        int count = 0;
        if (index == 0) {
            this->head = current->next;
        } else {
            while (current != NULL) {
                if (count == index - 1) {
                    if (!current->next) {
                        current->next = NULL;
                        break;
                    } else {
                        current->next = current->next->next;
                        break;
                    }
                }
                count++;
                current = current->next;
            }
        }
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
