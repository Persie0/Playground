package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.installations.C1154a;
import com.lingq.p020ui.HomeFragment;
import p000.bh4;
import p000.lda;
import p000.wfb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru3 implements gr6, rg6, tr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HomeFragment f59825a;

    public /* synthetic */ ru3(HomeFragment homeFragment) {
        this.f59825a = homeFragment;
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(final Task task) {
        bh4[] bh4VarArr = HomeFragment.f33886N0;
        task.getClass();
        if (task.mo5971m()) {
            Object obj = C1154a.f13703m;
            tld tldVarM6697c = ((C1154a) q43.m19641c().m19645b(x43.class)).m6697c();
            final HomeFragment homeFragment = this.f59825a;
            tldVarM6697c.m22200o(new tr6() { // from class: com.lingq.ui.c
                @Override // p000.tr6
                /* JADX INFO: renamed from: f */
                public final void mo4558f(Task task2) {
                    bh4[] bh4VarArr2 = HomeFragment.f33886N0;
                    task2.getClass();
                    String str = (String) task.mo5967i();
                    String str2 = (String) task2.mo5967i();
                    String str3 = Build.MODEL;
                    HomeFragment homeFragment2 = homeFragment;
                    if (homeFragment2.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                        C2888d c2888dM9798k0 = homeFragment2.m9798k0();
                        c2888dM9798k0.getClass();
                        wfb.m23926u(lda.m16103C(c2888dM9798k0), c2888dM9798k0.f34181p, null, new HomeViewModel$registerFirebase$1(c2888dM9798k0, str, str2, null), 2);
                    }
                }
            });
            return;
        }
        r43 r43VarM20289a = r43.m20289a();
        Exception excMo5966h = task.mo5966h();
        if (excMo5966h == null) {
            excMo5966h = new Exception("getInstanceId failed");
        }
        r43VarM20289a.m20290b(excMo5966h);
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        bh4[] bh4VarArr = HomeFragment.f33886N0;
        view.getClass();
        c6b c6bVar = f6bVar.f38536a;
        l64 l64VarMo136i = c6bVar.mo136i(519);
        l64VarMo136i.getClass();
        HomeFragment homeFragment = this.f59825a;
        BottomNavigationView bottomNavigationView = homeFragment.m9797j0().f59103a;
        int i = l64VarMo136i.f49119d;
        bottomNavigationView.setPadding(bottomNavigationView.getPaddingLeft(), bottomNavigationView.getPaddingTop(), bottomNavigationView.getPaddingRight(), i);
        BottomNavigationView bottomNavigationView2 = homeFragment.m9797j0().f59103a;
        ViewGroup.LayoutParams layoutParams = bottomNavigationView2.getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        bottomNavigationView2.setLayoutParams(marginLayoutParams);
        return c6bVar.mo4371r(0, 0, 0, i);
    }
}
