package com.lingq.p020ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingq.R$id;
import com.lingq.R$layout;
import com.lingq.core.domain.model.user.C1503e;
import com.lingq.core.domain.model.user.ImportData;
import com.lingq.core.player.C1808b;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3487q7;
import p000.C3509qs;
import p000.RunnableC3470pr;
import p000.b34;
import p000.bh4;
import p000.c82;
import p000.df4;
import p000.dp5;
import p000.dta;
import p000.fa4;
import p000.hj6;
import p000.hm5;
import p000.id6;
import p000.jd6;
import p000.jfa;
import p000.kd6;
import p000.lb5;
import p000.og8;
import p000.ph2;
import p000.q43;
import p000.r86;
import p000.rd3;
import p000.ru3;
import p000.sq5;
import p000.st3;
import p000.su3;
import p000.thb;
import p000.ud6;
import p000.ui3;
import p000.v72;
import p000.vk9;
import p000.vu3;
import p000.vz1;
import p000.w41;
import p000.wf0;
import p000.wfb;
import p000.wr9;
import p000.wsa;
import p000.wu3;
import p000.x74;
import p000.xfa;
import p000.y38;
import p000.zi3;
import p000.zu3;

/* JADX INFO: loaded from: classes.dex */
public final class HomeFragment extends st3 {

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ bh4[] f33886N0 = {new PropertyReference1Impl(HomeFragment.class, "binding", "getBinding()Lcom/lingq/databinding/FragmentHomeBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f33887C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f33888D0;

    /* JADX INFO: renamed from: E0 */
    public final sq5 f33889E0;

    /* JADX INFO: renamed from: F0 */
    public ud6 f33890F0;

    /* JADX INFO: renamed from: G0 */
    public ArrayAdapter f33891G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f33892H0;

    /* JADX INFO: renamed from: I0 */
    public hm5 f33893I0;

    /* JADX INFO: renamed from: J0 */
    public C3509qs f33894J0;

    /* JADX INFO: renamed from: K0 */
    public og8 f33895K0;

    /* JADX INFO: renamed from: L0 */
    public C1808b f33896L0;

    /* JADX INFO: renamed from: M0 */
    public w41 f33897M0;

    public HomeFragment() {
        super(R$layout.fragment_home, 0);
        this.f33887C0 = jfa.m14432o(this, HomeFragment$binding$2.f33898i);
        this.f33888D0 = new w41(y38.m24933a(C2888d.class), new ui3() { // from class: com.lingq.ui.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return this.f33935b.m2089Q().mo2116r();
            }
        }, new ui3() { // from class: com.lingq.ui.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return this.f33937b.m2089Q().mo2102d();
            }
        }, new ui3() { // from class: com.lingq.ui.HomeFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return this.f33936b.m2089Q().mo2103e();
            }
        });
        this.f33889E0 = new sq5(3, y38.m24933a(zu3.class), new c82(this, 2));
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m9794g0(HomeFragment homeFragment, int i, Integer num) {
        if (homeFragment.m9797j0().f59103a.getSelectedItemId() != i) {
            homeFragment.m9797j0().f59103a.setSelectedItemId(i);
        }
        r86 r86VarM13127f = b34.m3244j(homeFragment).f63760b.m13127f();
        if (r86VarM13127f == null || r86VarM13127f.f58881b.f57368b != num.intValue()) {
            ud6 ud6Var = homeFragment.f33890F0;
            if (ud6Var != null) {
                ud6Var.m22690g(num.intValue(), false);
            } else {
                fa4.m11636J("navController");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        m9795h0();
        m9798k0().mo8768j0(true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        FirebaseMessaging firebaseMessaging;
        view.getClass();
        ru3 ru3Var = new ru3(this);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, ru3Var);
        vz1.m23598B(this);
        x74.m24339F(this, "lessonImportedFromWeb", new zi3() { // from class: com.lingq.ui.b
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle = (Bundle) obj2;
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                ((String) obj).getClass();
                bundle.getClass();
                int i = bundle.getInt("lessonImportedId");
                if (i != 0) {
                    HomeFragment homeFragment = this.f34164a;
                    lb5 lb5VarM2508a = AbstractC0708b.m2508a(homeFragment);
                    v72 v72Var = ph2.f56212a;
                    wfb.m23926u(lb5VarM2508a, dp5.f36000a, null, new HomeFragment$onViewCreated$2$1(homeFragment, i, null), 2);
                }
                return xfa.f68157a;
            }
        });
        rd3 rd3VarM9797j0 = m9797j0();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = m2106h().m2136D(R$id.nav_host_fragment);
        abstractComponentCallbacksC0635cM2136D.getClass();
        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
        this.f33890F0 = ud6VarM2573c0;
        BottomNavigationView bottomNavigationView = rd3VarM9797j0.f59103a;
        if (ud6VarM2573c0 == null) {
            fa4.m11636J("navController");
            throw null;
        }
        bottomNavigationView.setOnItemSelectedListener(new C3487q7(ud6VarM2573c0, 17));
        ud6VarM2573c0.m22684a(new hj6(new WeakReference(bottomNavigationView), ud6VarM2573c0));
        rd3VarM9797j0.f59103a.setOnItemReselectedListener(new ru3(this));
        ComposeView composeView = m9797j0().f59105c;
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(-1672785332, true, new su3(this, 0)));
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(q43.m19641c());
        }
        firebaseMessaging.getClass();
        wr9 wr9Var = new wr9();
        firebaseMessaging.f13726f.execute(new RunnableC3470pr(15, firebaseMessaging, wr9Var));
        wr9Var.f67208a.m22200o(new ru3(this));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2872xa4f401f2(this, Lifecycle$State.STARTED, null, this), 3);
        m9795h0();
        if (m9796i0().f58118b.getInt("currentTrack", 0) != 0) {
            m9796i0().m20133g();
            m9796i0().m20135i();
            m9796i0().m20130d();
            m9796i0().m20131e();
            view.addOnLayoutChangeListener(new wf0(this, 1));
        }
        if (m9796i0().f58118b.getInt("lessonTrack", 0) != 0) {
            int i = m9796i0().f58118b.getInt("lessonTrack", 0);
            m9796i0().m20135i();
            m9796i0().m20133g();
            m9796i0().m20130d();
            m9796i0().m20131e();
            view.addOnLayoutChangeListener(new vu3(this, i));
        }
        if (m9796i0().f58118b.getInt("currentCourse", 0) != 0) {
            int i2 = m9796i0().f58118b.getInt("currentCourse", 0);
            String string = m9796i0().f58118b.getString("currentCourseTitle", "");
            if (string == null) {
                string = "";
            }
            m9796i0().m20135i();
            m9796i0().m20133g();
            m9796i0().m20130d();
            m9796i0().m20131e();
            view.addOnLayoutChangeListener(new wu3(i2, string, this));
        }
        String string2 = m9796i0().f58118b.getString("deeplinkURL", "");
        if (vk9.m23391n0(string2 != null ? string2 : "")) {
            return;
        }
        C2888d c2888dM9798k0 = m9798k0();
        String string3 = m9796i0().f58118b.getString("deeplinkURL", "");
        String str = string3 != null ? string3 : "";
        c2888dM9798k0.getClass();
        c2888dM9798k0.f34169d.mo8247e0(str, 400L);
        m9796i0().m20134h("");
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9795h0() {
        if (((zu3) this.f33889E0.getValue()).f72173b == null) {
            C3509qs c3509qsM9796i0 = m9796i0();
            df4 df4Var = c3509qsM9796i0.f58117a;
            String string = c3509qsM9796i0.f58118b.getString("importData_4", "{}");
            String str = string != null ? string : "{}";
            C1503e c1503e = ImportData.Companion;
            ImportData importData = (ImportData) df4Var.m10321a(str, thb.m22059r(c1503e.serializer()));
            if (importData != null) {
                String str2 = importData.f19637a;
                String str3 = importData.f19638b;
                if (str2 == null || str3 == null || importData.f19639c == null) {
                    return;
                }
                id6 id6VarM14401a = jd6.m14401a(kd6.Companion, UserImportSourceType.URL, str3, str2, null, 8);
                C3509qs c3509qsM9796i1 = m9796i0();
                SharedPreferences.Editor editorEdit = c3509qsM9796i1.f58118b.edit();
                editorEdit.getClass();
                editorEdit.putString("importData_4", c3509qsM9796i1.f58117a.m10322b(thb.m22059r(c1503e.serializer()), null));
                editorEdit.apply();
                jfa.m14428k(b34.m3244j(this), id6VarM14401a, null);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final C3509qs m9796i0() {
        C3509qs c3509qs = this.f33894J0;
        if (c3509qs != null) {
            return c3509qs;
        }
        fa4.m11636J("appSettings");
        throw null;
    }

    /* JADX INFO: renamed from: j0 */
    public final rd3 m9797j0() {
        return (rd3) this.f33887C0.getValue(this, f33886N0[0]);
    }

    /* JADX INFO: renamed from: k0 */
    public final C2888d m9798k0() {
        return (C2888d) this.f33888D0.getValue();
    }
}
