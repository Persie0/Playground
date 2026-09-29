package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.fragment.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public final class de2 extends r86 {

    /* JADX INFO: renamed from: g */
    public String f35492g;

    @Override // p000.r86
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof de2) && super.equals(obj) && fa4.m11650l(this.f35492g, ((de2) obj).f35492g);
    }

    @Override // p000.r86
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f35492g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: k */
    public final void mo10135k(Context context, AttributeSet attributeSet) {
        super.mo10135k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.DialogFragmentNavigator);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(R$styleable.DialogFragmentNavigator_android_name);
        if (string != null) {
            this.f35492g = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
