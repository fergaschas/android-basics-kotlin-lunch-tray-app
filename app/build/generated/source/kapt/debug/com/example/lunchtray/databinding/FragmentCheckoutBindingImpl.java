package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 6);
        sViewsWithIds.put(R.id.entree_selection, 7);
        sViewsWithIds.put(R.id.entree_price, 8);
        sViewsWithIds.put(R.id.side_selection, 9);
        sViewsWithIds.put(R.id.side_price, 10);
        sViewsWithIds.put(R.id.accompaniment_selection, 11);
        sViewsWithIds.put(R.id.accompaniment_price, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.Button) bindings[5]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.orderViewModel == variableId) {
            setOrderViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderViewModel(@Nullable com.example.lunchtray.model.OrderViewModel OrderViewModel) {
        this.mOrderViewModel = OrderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.orderViewModel);
        super.requestRebind();
    }
    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.checkoutFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderViewModelTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeOrderViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeOrderViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderViewModelTax(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String orderViewModelTaxGetValue = null;
        java.lang.String orderViewModelSubtotalGetValue = null;
        com.example.lunchtray.model.OrderViewModel orderViewModel = mOrderViewModel;
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelTax = null;
        java.lang.String orderViewModelTotalGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelTotal = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelSubtotal = null;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (orderViewModel != null) {
                        // read orderViewModel.tax
                        orderViewModelTax = orderViewModel.getTax();
                    }
                    updateLiveDataRegistration(0, orderViewModelTax);


                    if (orderViewModelTax != null) {
                        // read orderViewModel.tax.getValue()
                        orderViewModelTaxGetValue = orderViewModelTax.getValue();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (orderViewModel != null) {
                        // read orderViewModel.total
                        orderViewModelTotal = orderViewModel.getTotal();
                    }
                    updateLiveDataRegistration(1, orderViewModelTotal);


                    if (orderViewModelTotal != null) {
                        // read orderViewModel.total.getValue()
                        orderViewModelTotalGetValue = orderViewModelTotal.getValue();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (orderViewModel != null) {
                        // read orderViewModel.subtotal
                        orderViewModelSubtotal = orderViewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(2, orderViewModelSubtotal);


                    if (orderViewModelSubtotal != null) {
                        // read orderViewModel.subtotal.getValue()
                        orderViewModelSubtotalGetValue = orderViewModelSubtotal.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback3);
            this.submitButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, orderViewModelSubtotalGetValue);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, orderViewModelTaxGetValue);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, orderViewModelTotalGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {



                    checkoutFragment.cancelOrder(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {



                    checkoutFragment.submitOrder(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderViewModel.tax
        flag 1 (0x2L): orderViewModel.total
        flag 2 (0x3L): orderViewModel.subtotal
        flag 3 (0x4L): orderViewModel
        flag 4 (0x5L): checkoutFragment
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}