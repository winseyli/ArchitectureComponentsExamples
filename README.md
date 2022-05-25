# ViewBinding vs DataBinding

The ViewBinding only generates the ViewBinding of your layout files, so you can refer to the views without using `findViewById`.

The DataBinding provides you the same but with extra functionalities like data-binding expressions (putting common Java logic in XML), common data variable for whole xml, annotations, etc.

## So when to use these?

In case you just need to access views in your Java code without any complex/repeating view logic (eg: change visibility of multiple views on basis of one data variable), then you should use ViewBinding as it is lighter and faster.

But in case you need more than just accessing the views like binding expressions, binding adapters, etc. (which is general requirement of big projects). You should use DataBinding as it provide more features.

For more info, please have a look at
- https://developer.android.com/topic/libraries/view-binding#data-binding - Comparison by AndroidDeveloper
- https://proandroiddev.com/new-in-android-viewbindings-the-difference-from-databinding-library-bef5945baf5e - Comparison by ProAndroidDev
