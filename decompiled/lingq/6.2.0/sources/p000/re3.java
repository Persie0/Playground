package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.fragment.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public final class re3 extends r86 {

    /* JADX INFO: renamed from: g */
    public String f59156g;

    @Override // p000.r86
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof re3) && super.equals(obj) && fa4.m11650l(this.f59156g, ((re3) obj).f59156g);
    }

    @Override // p000.r86
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f59156g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: k */
    public final void mo10135k(Context context, AttributeSet attributeSet) {
        super.mo10135k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.FragmentNavigator);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(R$styleable.FragmentNavigator_android_name);
        if (string != null) {
            this.f59156g = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // p000.r86
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f59156g;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
