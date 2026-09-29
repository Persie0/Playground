package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.navigation.R$styleable;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2917d7 extends r86 {

    /* JADX INFO: renamed from: g */
    public Intent f35068g;

    /* JADX INFO: renamed from: h */
    public String f35069h;

    public C2917d7(C2954e7 c2954e7) {
        super(c2954e7);
    }

    /* JADX INFO: renamed from: n */
    public static String m10134n(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return cl9.m4839V(str, "${applicationId}", packageName);
    }

    @Override // p000.r86
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2917d7) && super.equals(obj)) {
            Intent intent = this.f35068g;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((C2917d7) obj).f35068g);
            } else {
                zFilterEquals = ((C2917d7) obj).f35068g == null;
            }
            if (zFilterEquals && fa4.m11650l(this.f35069h, ((C2917d7) obj).f35069h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.r86
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f35068g;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f35069h;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: k */
    public final void mo10135k(Context context, AttributeSet attributeSet) {
        super.mo10135k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.ActivityNavigator);
        typedArrayObtainAttributes.getClass();
        String strM10134n = m10134n(context, typedArrayObtainAttributes.getString(R$styleable.ActivityNavigator_targetPackage));
        if (this.f35068g == null) {
            this.f35068g = new Intent();
        }
        Intent intent = this.f35068g;
        intent.getClass();
        intent.setPackage(strM10134n);
        String string = typedArrayObtainAttributes.getString(R$styleable.ActivityNavigator_android_name);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f35068g == null) {
                this.f35068g = new Intent();
            }
            Intent intent2 = this.f35068g;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(R$styleable.ActivityNavigator_action);
        if (this.f35068g == null) {
            this.f35068g = new Intent();
        }
        Intent intent3 = this.f35068g;
        intent3.getClass();
        intent3.setAction(string2);
        String strM10134n2 = m10134n(context, typedArrayObtainAttributes.getString(R$styleable.ActivityNavigator_data));
        if (strM10134n2 != null) {
            Uri uri = Uri.parse(strM10134n2);
            if (this.f35068g == null) {
                this.f35068g = new Intent();
            }
            Intent intent4 = this.f35068g;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.f35069h = m10134n(context, typedArrayObtainAttributes.getString(R$styleable.ActivityNavigator_dataPattern));
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final String m10136l() {
        return this.f35069h;
    }

    /* JADX INFO: renamed from: m */
    public final Intent m10137m() {
        return this.f35068g;
    }

    @Override // p000.r86
    public final String toString() {
        Intent intent = this.f35068g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f35068g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
