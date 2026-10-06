package p000;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: eq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0165eq implements InterfaceC0198fw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f15085a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0198fw f15086b;

    public C0165eq(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, InterfaceC0198fw interfaceC0198fw) {
        this.f15085a = layoutInflaterFactory2C0179fd;
        this.f15086b = interfaceC0198fw;
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: a */
    public final void mo7669a(AbstractC0199fx abstractC0199fx) {
        C0201fz c0201fz = (C0201fz) this.f15086b;
        c0201fz.f23953a.onDestroyActionMode(c0201fz.m8962e(abstractC0199fx));
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f15085a;
        if (layoutInflaterFactory2C0179fd.f21382q != null) {
            layoutInflaterFactory2C0179fd.f21375j.getDecorView().removeCallbacks(this.f15085a.f21383r);
        }
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd2 = this.f15085a;
        if (layoutInflaterFactory2C0179fd2.f21381p != null) {
            layoutInflaterFactory2C0179fd2.m8234A();
            LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd3 = this.f15085a;
            bkn bknVarM551k = afq.m551k(layoutInflaterFactory2C0179fd3.f21381p);
            bknVarM551k.m2594o(0.0f);
            layoutInflaterFactory2C0179fd3.f21352K = bknVarM551k;
            this.f15085a.f21352K.m2596q(new C0164ep(this));
        }
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd4 = this.f15085a;
        layoutInflaterFactory2C0179fd4.f21380o = null;
        aff.m467c(layoutInflaterFactory2C0179fd4.f21386u);
        this.f15085a.m8238E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: b */
    public final boolean mo7670b(AbstractC0199fx abstractC0199fx, MenuItem menuItem) {
        C0201fz c0201fz = (C0201fz) this.f15086b;
        return c0201fz.f23953a.onActionItemClicked(c0201fz.m8962e(abstractC0199fx), new MenuItemC0234he(c0201fz.f23954b, menuItem));
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: c */
    public final boolean mo7671c(AbstractC0199fx abstractC0199fx, Menu menu) {
        C0201fz c0201fz = (C0201fz) this.f15086b;
        return c0201fz.f23953a.onCreateActionMode(c0201fz.m8962e(abstractC0199fx), c0201fz.m8963f(menu));
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: d */
    public final void mo7672d(AbstractC0199fx abstractC0199fx, Menu menu) {
        aff.m467c(this.f15085a.f21386u);
        C0201fz c0201fz = (C0201fz) this.f15086b;
        c0201fz.f23953a.onPrepareActionMode(c0201fz.m8962e(abstractC0199fx), c0201fz.m8963f(menu));
    }
}
