So you may be wondering... "what is this massive lump of un-commented Java code that you just dumped onto GitHub?"

Good question.


# The main source directory
In the [main source directory](src/HTMLEngine), there are four subdirectories
- [exceptions](#exceptions)
- [nodes](#nodes)
- [tests](#tests)
- [utils](#tests)


## exceptions
HTML Engine has a [base exception](src/HTMLEngine/exceptions/BaseException.java), that all custom exceptions derive from.

It also has (at the moment only one) exception that's used throughout HTML Engine, [InvalidCharacterException](src/HTMLEngine/exception/InvalidCharacterException.java) which is thrown when there is an invalid character in something like an attribute or tag name.


## nodes
There are two nodes:
- [Text](src/HTMLEngine/nodes/Text.java), where all text content is stored.
- [Tag](src/HTMLEngine/nodes/tag/Tag.java), which is the tag with all it's [attributes](src/HTMLEngine/nodes/tag/Attribute.java).

For example, in the code ``<p class="get-a-life">Do something real instead of making pointless code on github</p>``, ``<p class="get-a-life">`` and ``</p>`` are from a Tag element (or node), and "Do something real instead of making pointless code on github" is from a Text node. 

Tag elements can have children (I know that sounds weird). The children can be other nodes, for example an ``a`` Tag being in a ``p`` Tag, or a Text element being in a ``span`` Tag.
Text elements cannot have children (that also sounds weird).

## tests
There is one test in the tests folder called, well, [Test](src/HTMLEngine/tests/Test.java). This is just some example code

## utils
[Utils](src/HTMLEngine/utils/Utils.java) is the only file in the utils directory, and it contains various random functions (yes, functions, not methods, they're all static) that are used throughout HTML Engine. Unlike most of this code, the functions in Utils are pretty self-explanatory
