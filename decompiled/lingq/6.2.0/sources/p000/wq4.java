package p000;

import androidx.compose.p002ui.layout.C0339f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wq4 extends mq4 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0339f f67176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f67177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq4(C0339f c0339f, zi3 zi3Var, String str) {
        super(str);
        this.f67176b = c0339f;
        this.f67177c = zi3Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        C0339f c0339f = this.f67176b;
        uq4 uq4Var = c0339f.f4200h;
        uq4Var.f64210a = jt5Var.getLayoutDirection();
        uq4Var.f64211b = jt5Var.mo594a();
        uq4Var.f64212c = jt5Var.mo597d0();
        boolean zMo211f0 = jt5Var.mo211f0();
        zi3 zi3Var = this.f67177c;
        if (zMo211f0 || c0339f.f4193a.f4348h == null) {
            c0339f.f4196d = 0;
            it5 it5Var = (it5) zi3Var.invoke(uq4Var, new bk1(j));
            return new vq4(it5Var, c0339f, c0339f.f4196d, it5Var, 1);
        }
        c0339f.f4197e = 0;
        it5 it5Var2 = (it5) zi3Var.invoke(c0339f.f4201i, new bk1(j));
        return new vq4(it5Var2, c0339f, c0339f.f4197e, it5Var2, 0);
    }
}
