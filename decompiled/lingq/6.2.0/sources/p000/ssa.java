package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ssa extends uq9 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f61372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssa(int i, int i2) {
        super(i, Boolean.class, 0, 28);
        this.f61372e = i2;
        switch (i2) {
            case 1:
                super(i, CharSequence.class, 8, 28);
                break;
            case 2:
                super(i, CharSequence.class, 64, 30);
                break;
            case 3:
                super(i, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    @Override // p000.uq9
    /* JADX INFO: renamed from: b */
    public final Object mo21731b(View view) {
        switch (this.f61372e) {
            case 0:
                return Boolean.valueOf(zsa.m25772c(view));
            case 1:
                return zsa.m25770a(view);
            case 2:
                return bta.m4164b(view);
            default:
                return Boolean.valueOf(zsa.m25771b(view));
        }
    }

    @Override // p000.uq9
    /* JADX INFO: renamed from: c */
    public final void mo21732c(View view, Object obj) {
        switch (this.f61372e) {
            case 0:
                zsa.m25775f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                zsa.m25774e(view, (CharSequence) obj);
                break;
            case 2:
                bta.m4166d(view, (CharSequence) obj);
                break;
            default:
                zsa.m25773d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.uq9
    /* JADX INFO: renamed from: f */
    public final boolean mo21733f(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f61372e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
