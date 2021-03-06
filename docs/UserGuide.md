# easyLog User Guide

easyLog is a command line interface (CLI) application for warehouse employees to manage their items and
orders in their warehouse. easyLog allows information of new items and orders to be added,
view existing items and orders in the warehouse, remove specific existing items and order,
clear all existing items and orders. If you type fast, easyLog can get your logistic management tasks done
faster than traditional graphical user interface (GUI) apps.

- [Quick start](#quick-start)
- [Features](#features)
  * [Viewing help: `help`](#viewing-help-help)
  * [Items](#items)
    - [Show items-related commands: `items`](#show-items-related-commands-items)
    - [Adding an item: `items add`](#adding-an-item-items-add)
    * [List all the tasks: `list`](#list-all-the-tasks-list)
    * [Complete a task: `done`](#complete-a-task-done)
    * [Delete an item: `delete`](#delete-an-item-items-delete)
  * [Orders](#orders)
    - [Show orders-related commands: `orders`](#show-orders-related-commands--orders)
    - [Adding an order: `orders add`](#adding-an-order-orders-add)
  * [Exit the program: `exit`](#exit-the-program-bye)
  * [Save task list](#save-task-list)
- [FAQ](#faq)
- [Command Summary](#command-summary)

## Quick start

1. Ensure you have Java 11 or above installed in your Computer.
2. Download the latest Duke.jar from [here](https://github.com/ongweisheng/ip/releases/tag/A-Release).
3. Copy the file to the folder you want to use as the home folder for your Duke.
4. Open up a terminal/command window at the location where Duke.jar
5. Run the command `java -jar Duke.jar`
6. The app should load as shown below

```
Hello! I'm Duke
What can I do for you? Enter help to view commands.
```
7. Type a command and press enter to continue using the app.
8. Refer to the [Features](#features) below for details of each command.

## Features

### Viewing help: `help`

* Shows available commands of the app.

* Format: `help`

* Expected Output:

```
General Options:
  1. items                          Show items-related commands
  2. items add <item_name>          Add an item
  3. items list                     List all items
  4. items delete <item_index>      Delete an item
  5. items clear                    Empty all items
  6. orders                         Show orders-related commands
  7. orders add <order_name>        Add an order
  8. orders list                    List all orders
  9. orders delete <order_index>    delete an order
  10. orders clear                  Empty all orders
```

### Items

#### Show items-related commands: `items`

* Show commands related to items and brief description of the commands: add item, list items, remove items, clear items

* Format: `items`

* Expected Output:

```
Items-Related Options:
  1. items add <item_name>          Add an item
  2. items list                     List all items
  3. items delete <item_index>      Delete an item
  4. items clear                    Empty all items
```

#### Adding an item: `items add`

* Add an item to the system.

* Format: `items add <item_name>`

* Example: `items add PS5`

* Expected Output:

```
Got it! The item [PS5] is added.
```

#### Showing the item list: `items list`

* Display all recorded items in the system.

* Format: `items list`

* Expected Output:

```
Here are the list of items.
1. PS5
2. bag
```

#### Delete an item: `items delete`

* Delete item number _ from item list.

* Format: `items delete <item_index>`

* Example: `items delete 2`

* Expected Output:

```
Got it! The item [glove] is deleted.
```

#### Emptying the item list: `items clear`

* Clear all recorded items in the system.

* Format: `items clear`

* Expected Output:

```
Done! I just cleared all items for you.
```

### Orders

#### Show orders-related commands : `orders`

* Show commands related to orders and brief description of the commands:
add order, list orders, remove orders, clear orders

* Format: `orders`

* Expected Output:

```
Orders-Related Options:
  1. orders add <order_name>        Add an order
  2. orders list                    List all orders
  3. orders delete <order_index>    Remove an order
  4. orders clear                   Empty all orders
```

#### Adding an order: `orders add`

* Add an order to the system.

* Format:

```
orders add <customer_name>
Input the items to be added to this order.
<index> <index> <index>
```

* Example:

```
orders add weisheng
Input the items to be added to this order.
1 2 
```

* Expected Output:

```
Input the items to be added to this order.
Got it! The order for customer [weisheng] is added.
```

#### Showing the order list: `orders list`

* Display all recorded orders in the system.

* Format: `orders list`

* Expected Output:

```
Here are the list of orders.
1. weisheng
    1. PS5
    2. bag
2. Coco
    1. PS5

```

#### Removing an order: `orders delete`

* Delete an order from the order list

* Format: `orders delete <order_index>`

* Example: `orders delete 2`

* Expected Output:

```
Got it! The order for customer [Coco] is deleted.
```


#### Emptying the order list: `orders clear`

* Clear all recorded orders in the system.

* Format: `orders clear`

* Expected Output:

```
Done! I just cleared all orders for you.
```

### Exit the program: `exit`

* Exit the app.

* Format: `exit`

* Expected Output:

```
Bye. Thanks for using easyLog!
```

### Save task list

Duke save files are automatically updated or created when there is no existing save file
when `exit` command is entered. There is no need to save manually. Save files are also loaded on start up
of the application if it exists.

## FAQ

**Q1**: Where is the save file stored or created after I exit the program?

> Save file `duke.txt` is stored in the directory you ran the app in.

## Command Summary

Command | Format | Example |
------- | ------- | ------- | 
todo | `todo <description>` | `todo edit ip` |
deadline | `deadline <description> /by <dd/mm/yyyy and time>` | `deadline complete ip /by 23/02/2021 2359` |
event | `event <description> /at <dd/mm/yyyy and time>`      | `event Liverpool v Sheffield Utd /at 01/03/2021 0315` |
list | `list` | `list` |
done | `done <index>` | `done 2` |
delete | `delete <index>` | `delete 2` |
find | `find <keyword>` | `find mushroom` |
exit | `exit` | `exit` |
