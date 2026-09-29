package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.common.R$styleable;
import java.util.Iterator;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public final class u86 extends r86 implements Iterable, tg4 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f63588h = 0;

    /* JADX INFO: renamed from: g */
    public final sg3 f63589g;

    public u86(tb6 tb6Var) {
        super(tb6Var);
        this.f63589g = new sg3(this);
    }

    @Override // p000.r86
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u86) || !super.equals(obj)) {
            return false;
        }
        sg3 sg3Var = this.f63589g;
        int iM19081e = ((pe9) sg3Var.f60818d).m19081e();
        sg3 sg3Var2 = ((u86) obj).f63589g;
        if (iM19081e != ((pe9) sg3Var2.f60818d).m19081e() || sg3Var.f60816b != sg3Var2.f60816b) {
            return false;
        }
        pe9 pe9Var = (pe9) sg3Var.f60818d;
        pe9Var.getClass();
        for (r86 r86Var : (aj1) AbstractC3204c.m15413i0(new C3705w0(pe9Var, 3))) {
            if (!r86Var.equals(((pe9) sg3Var2.f60818d).m19078b(r86Var.f58881b.f57368b))) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.r86
    public final int hashCode() {
        sg3 sg3Var = this.f63589g;
        int iM19079c = sg3Var.f60816b;
        pe9 pe9Var = (pe9) sg3Var.f60818d;
        int iM19081e = pe9Var.m19081e();
        for (int i = 0; i < iM19081e; i++) {
            iM19079c = (((iM19079c * 31) + pe9Var.m19079c(i)) * 31) + ((r86) pe9Var.m19082f(i)).hashCode();
        }
        return iM19079c;
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: i */
    public final String mo20443i() {
        String strMo20443i = super.mo20443i();
        sg3 sg3Var = this.f63589g;
        sg3Var.getClass();
        strMo20443i.getClass();
        return ((u86) sg3Var.f60817c).f58881b.f57368b != 0 ? strMo20443i : "the root navigation";
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sg3 sg3Var = this.f63589g;
        sg3Var.getClass();
        return new xa6(sg3Var);
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: j */
    public final q86 mo20444j(sq5 sq5Var) {
        q86 q86VarMo20444j = super.mo20444j(sq5Var);
        sg3 sg3Var = this.f63589g;
        sg3Var.getClass();
        return sg3Var.m21358j(q86VarMo20444j, sq5Var, false, (u86) sg3Var.f60817c);
    }

    @Override // p000.r86
    /* JADX INFO: renamed from: k */
    public final void mo10135k(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.mo10135k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.NavGraphNavigator);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.NavGraphNavigator_startDestination, 0);
        sg3 sg3Var = this.f63589g;
        sg3Var.m21361m(resourceId);
        int i = sg3Var.f60816b;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
                strValueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
        }
        sg3Var.f60819e = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final void m22537l(r86 r86Var) {
        r86Var.getClass();
        sg3 sg3Var = this.f63589g;
        pe9 pe9Var = (pe9) sg3Var.f60818d;
        u86 u86Var = (u86) sg3Var.f60817c;
        C3488q8 c3488q8 = u86Var.f58881b;
        C3488q8 c3488q9 = r86Var.f58881b;
        int i = c3488q9.f57368b;
        String str = (String) c3488q9.f57373g;
        if (i == 0 && str == null) {
            C3386nv.m17626m("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = (String) c3488q8.f57373g;
        if (str2 != null && fa4.m11650l(str, str2)) {
            ij6.m13963u("Destination ", r86Var, " cannot have the same route as graph ", u86Var);
            return;
        }
        if (i == c3488q8.f57368b) {
            ij6.m13963u("Destination ", r86Var, " cannot have the same id as graph ", u86Var);
            return;
        }
        r86 r86Var2 = (r86) pe9Var.m19078b(i);
        if (r86Var2 == r86Var) {
            return;
        }
        if (r86Var.f58882c != null) {
            C3386nv.m17633t("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (r86Var2 != null) {
            r86Var2.f58882c = null;
        }
        r86Var.f58882c = u86Var;
        pe9Var.m19080d(c3488q9.f57368b, r86Var);
    }

    /* JADX INFO: renamed from: m */
    public final r86 m22538m(int i) {
        sg3 sg3Var = this.f63589g;
        return sg3Var.m21353e(i, (u86) sg3Var.f60817c, null, false);
    }

    /* JADX INFO: renamed from: n */
    public final q86 m22539n(sq5 sq5Var, r86 r86Var) {
        return this.f63589g.m21358j(super.mo20444j(sq5Var), sq5Var, true, r86Var);
    }

    @Override // p000.r86
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sg3 sg3Var = this.f63589g;
        sg3Var.getClass();
        sg3Var.getClass();
        r86 r86VarM22538m = m22538m(sg3Var.f60816b);
        sb.append(" startDestination=");
        if (r86VarM22538m == null) {
            String str = (String) sg3Var.f60819e;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(sg3Var.f60816b));
            }
        } else {
            sb.append("{");
            sb.append(r86VarM22538m.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
