package com.orbitalsonic.scientificcalculator.databinding;
import com.orbitalsonic.scientificcalculator.R;
import com.orbitalsonic.scientificcalculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_rad_deg, 1);
        sViewsWithIds.put(R.id.topLayout, 2);
        sViewsWithIds.put(R.id.tvInputCalculation, 3);
        sViewsWithIds.put(R.id.tvEqualCalculation, 4);
        sViewsWithIds.put(R.id.lineDivider, 5);
        sViewsWithIds.put(R.id.layoutNumbers, 6);
        sViewsWithIds.put(R.id.btnSecond, 7);
        sViewsWithIds.put(R.id.btnDegree, 8);
        sViewsWithIds.put(R.id.btnSin, 9);
        sViewsWithIds.put(R.id.btnCos, 10);
        sViewsWithIds.put(R.id.btnTan, 11);
        sViewsWithIds.put(R.id.btnPower, 12);
        sViewsWithIds.put(R.id.btnLog, 13);
        sViewsWithIds.put(R.id.btnNaturalLog, 14);
        sViewsWithIds.put(R.id.btnParenthesisStart, 15);
        sViewsWithIds.put(R.id.btnParenthesisClose, 16);
        sViewsWithIds.put(R.id.btnSquareRoot, 17);
        sViewsWithIds.put(R.id.btnAllClear, 18);
        sViewsWithIds.put(R.id.btnBackClear, 19);
        sViewsWithIds.put(R.id.btnPercentage, 20);
        sViewsWithIds.put(R.id.btnDivision, 21);
        sViewsWithIds.put(R.id.btnMode, 22);
        sViewsWithIds.put(R.id.btnSeven, 23);
        sViewsWithIds.put(R.id.btnEight, 24);
        sViewsWithIds.put(R.id.btnNine, 25);
        sViewsWithIds.put(R.id.btnMultiplication, 26);
        sViewsWithIds.put(R.id.btnMultiplicativeInverse, 27);
        sViewsWithIds.put(R.id.btnFour, 28);
        sViewsWithIds.put(R.id.btnFive, 29);
        sViewsWithIds.put(R.id.btnSix, 30);
        sViewsWithIds.put(R.id.btnSubtraction, 31);
        sViewsWithIds.put(R.id.btnPi, 32);
        sViewsWithIds.put(R.id.btnOne, 33);
        sViewsWithIds.put(R.id.btnTwo, 34);
        sViewsWithIds.put(R.id.btnThree, 35);
        sViewsWithIds.put(R.id.btnAddition, 36);
        sViewsWithIds.put(R.id.btnChangeCalculatorLayout, 37);
        sViewsWithIds.put(R.id.btnExponent1, 38);
        sViewsWithIds.put(R.id.btnChangeCalculator1, 39);
        sViewsWithIds.put(R.id.btnExponentLayout, 40);
        sViewsWithIds.put(R.id.btnExponent2, 41);
        sViewsWithIds.put(R.id.btnChangeCalculator2, 42);
        sViewsWithIds.put(R.id.btnZero, 43);
        sViewsWithIds.put(R.id.btnDot, 44);
        sViewsWithIds.put(R.id.btnEqual, 45);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[36]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.RelativeLayout) bindings[37]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.TextView) bindings[44]
            , (android.widget.TextView) bindings[24]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[41]
            , (android.widget.RelativeLayout) bindings[40]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[22]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[43]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.view.View) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}