package com.lingq.p055ui.home.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.menu.HelpFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import ni.C7796d;
import ni.C7797e;
import p003a2.C0009a;
import p225kk.C6716m;
import p254m2.C7472a;
import p322pd.C8228i;
import p338qd.C8573r0;
import p537zi.AbstractC10496f;
import ph.C8354s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/menu/HelpFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class HelpFragment extends AbstractC10496f {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25033D0 = {C0204c.m857q(HelpFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHelpBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f25034A0;

    /* JADX INFO: renamed from: B0 */
    public C7796d f25035B0;

    /* JADX INFO: renamed from: C0 */
    public C7797e f25036C0;

    public HelpFragment() {
        super(R.layout.fragment_help);
        this.f25034A0 = C4924a.m10477o0(this, HelpFragment$binding$2.f25037j);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        final int i10 = 0;
        final int i11 = 1;
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 180L;
        m3585f0(c8228iM29r);
        m3591j0(new C8228i(0, true));
        C8354s c8354s = (C8354s) this.f25034A0.m10489a(this, f25033D0[0]);
        c8354s.f45211a.setTitle(m3600t(R.string.settings_text_help));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8354s.f45211a;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: zi.a

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52422b;

            {
                this.f52422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                HelpFragment helpFragment = this.f52422b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C8573r0.m16725g0(helpFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13329n(helpFragment.m3578a0(), "https://www.lingq.com/how-to-use-lingq/", Integer.valueOf(R.string.texts_how_to_use_lingq), C8573r0.m16725g0(helpFragment));
                        C7796d c7796d = helpFragment.f25035B0;
                        if (c7796d != null) {
                            c7796d.m15505b(null, "opened_how_to_use_lingq");
                            return;
                        } else {
                            C5207g.m11117l("analytics");
                            throw null;
                        }
                    case 2:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/KxLevx9DjS8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/KxLevx9DjS8");
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/phq1n6u5v74", null, 12);
                        helpFragment.m9957n0("https://youtu.be/phq1n6u5v74");
                        return;
                }
            }
        });
        c8354s.f45215e.setOnClickListener(new View.OnClickListener(this) { // from class: zi.a

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52422b;

            {
                this.f52422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                HelpFragment helpFragment = this.f52422b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C8573r0.m16725g0(helpFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13329n(helpFragment.m3578a0(), "https://www.lingq.com/how-to-use-lingq/", Integer.valueOf(R.string.texts_how_to_use_lingq), C8573r0.m16725g0(helpFragment));
                        C7796d c7796d = helpFragment.f25035B0;
                        if (c7796d != null) {
                            c7796d.m15505b(null, "opened_how_to_use_lingq");
                            return;
                        } else {
                            C5207g.m11117l("analytics");
                            throw null;
                        }
                    case 2:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/KxLevx9DjS8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/KxLevx9DjS8");
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/phq1n6u5v74", null, 12);
                        helpFragment.m9957n0("https://youtu.be/phq1n6u5v74");
                        return;
                }
            }
        });
        c8354s.f45222l.setOnClickListener(new View.OnClickListener(this) { // from class: zi.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52424b;

            {
                this.f52424b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                HelpFragment helpFragment = this.f52424b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/bDCwK-ZOpuU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/bDCwK-ZOpuU");
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C7797e c7797e = helpFragment.f25036C0;
                        if (c7797e != null) {
                            c7797e.m15508a(helpFragment.m3576Y());
                            return;
                        } else {
                            C5207g.m11117l("utils");
                            throw null;
                        }
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/Uly24S4sLXs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/Uly24S4sLXs");
                        return;
                }
            }
        });
        c8354s.f45217g.setOnClickListener(new View.OnClickListener(this) { // from class: zi.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52426b;

            {
                this.f52426b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                HelpFragment helpFragment = this.f52426b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/fv5HVWbrnC8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/fv5HVWbrnC8");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/ysBoR8fjyvU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/ysBoR8fjyvU");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/SFmLxJrR9Uk", null, 12);
                        helpFragment.m9957n0("https://youtu.be/SFmLxJrR9Uk");
                        break;
                }
            }
        });
        c8354s.f45220j.setOnClickListener(new View.OnClickListener(this) { // from class: zi.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52428b;

            {
                this.f52428b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                HelpFragment helpFragment = this.f52428b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/qOnyU_cI8Zw", null, 12);
                        helpFragment.m9957n0("https://youtu.be/qOnyU_cI8Zw");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/q9dVfNdKM_g", null, 12);
                        helpFragment.m9957n0("https://youtu.be/q9dVfNdKM_g");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/LpKLlYgCYVs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/LpKLlYgCYVs");
                        break;
                }
            }
        });
        final int i12 = 2;
        c8354s.f45212b.setOnClickListener(new View.OnClickListener(this) { // from class: zi.a

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52422b;

            {
                this.f52422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                HelpFragment helpFragment = this.f52422b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C8573r0.m16725g0(helpFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13329n(helpFragment.m3578a0(), "https://www.lingq.com/how-to-use-lingq/", Integer.valueOf(R.string.texts_how_to_use_lingq), C8573r0.m16725g0(helpFragment));
                        C7796d c7796d = helpFragment.f25035B0;
                        if (c7796d != null) {
                            c7796d.m15505b(null, "opened_how_to_use_lingq");
                            return;
                        } else {
                            C5207g.m11117l("analytics");
                            throw null;
                        }
                    case 2:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/KxLevx9DjS8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/KxLevx9DjS8");
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/phq1n6u5v74", null, 12);
                        helpFragment.m9957n0("https://youtu.be/phq1n6u5v74");
                        return;
                }
            }
        });
        c8354s.f45216f.setOnClickListener(new View.OnClickListener(this) { // from class: zi.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52424b;

            {
                this.f52424b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                HelpFragment helpFragment = this.f52424b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/bDCwK-ZOpuU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/bDCwK-ZOpuU");
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C7797e c7797e = helpFragment.f25036C0;
                        if (c7797e != null) {
                            c7797e.m15508a(helpFragment.m3576Y());
                            return;
                        } else {
                            C5207g.m11117l("utils");
                            throw null;
                        }
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/Uly24S4sLXs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/Uly24S4sLXs");
                        return;
                }
            }
        });
        c8354s.f45218h.setOnClickListener(new View.OnClickListener(this) { // from class: zi.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52426b;

            {
                this.f52426b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                HelpFragment helpFragment = this.f52426b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/fv5HVWbrnC8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/fv5HVWbrnC8");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/ysBoR8fjyvU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/ysBoR8fjyvU");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/SFmLxJrR9Uk", null, 12);
                        helpFragment.m9957n0("https://youtu.be/SFmLxJrR9Uk");
                        break;
                }
            }
        });
        c8354s.f45221k.setOnClickListener(new View.OnClickListener(this) { // from class: zi.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52428b;

            {
                this.f52428b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                HelpFragment helpFragment = this.f52428b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/qOnyU_cI8Zw", null, 12);
                        helpFragment.m9957n0("https://youtu.be/qOnyU_cI8Zw");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/q9dVfNdKM_g", null, 12);
                        helpFragment.m9957n0("https://youtu.be/q9dVfNdKM_g");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/LpKLlYgCYVs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/LpKLlYgCYVs");
                        break;
                }
            }
        });
        final int i13 = 3;
        c8354s.f45223m.setOnClickListener(new View.OnClickListener(this) { // from class: zi.a

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52422b;

            {
                this.f52422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i14 = i13;
                HelpFragment helpFragment = this.f52422b;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C8573r0.m16725g0(helpFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13329n(helpFragment.m3578a0(), "https://www.lingq.com/how-to-use-lingq/", Integer.valueOf(R.string.texts_how_to_use_lingq), C8573r0.m16725g0(helpFragment));
                        C7796d c7796d = helpFragment.f25035B0;
                        if (c7796d != null) {
                            c7796d.m15505b(null, "opened_how_to_use_lingq");
                            return;
                        } else {
                            C5207g.m11117l("analytics");
                            throw null;
                        }
                    case 2:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/KxLevx9DjS8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/KxLevx9DjS8");
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/phq1n6u5v74", null, 12);
                        helpFragment.m9957n0("https://youtu.be/phq1n6u5v74");
                        return;
                }
            }
        });
        c8354s.f45213c.setOnClickListener(new View.OnClickListener(this) { // from class: zi.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52424b;

            {
                this.f52424b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i14 = i10;
                HelpFragment helpFragment = this.f52424b;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/bDCwK-ZOpuU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/bDCwK-ZOpuU");
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        C7797e c7797e = helpFragment.f25036C0;
                        if (c7797e != null) {
                            c7797e.m15508a(helpFragment.m3576Y());
                            return;
                        } else {
                            C5207g.m11117l("utils");
                            throw null;
                        }
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/Uly24S4sLXs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/Uly24S4sLXs");
                        return;
                }
            }
        });
        c8354s.f45214d.setOnClickListener(new View.OnClickListener(this) { // from class: zi.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52426b;

            {
                this.f52426b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i14 = i10;
                HelpFragment helpFragment = this.f52426b;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/fv5HVWbrnC8", null, 12);
                        helpFragment.m9957n0("https://youtu.be/fv5HVWbrnC8");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/ysBoR8fjyvU", null, 12);
                        helpFragment.m9957n0("https://youtu.be/ysBoR8fjyvU");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/SFmLxJrR9Uk", null, 12);
                        helpFragment.m9957n0("https://youtu.be/SFmLxJrR9Uk");
                        break;
                }
            }
        });
        c8354s.f45219i.setOnClickListener(new View.OnClickListener(this) { // from class: zi.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HelpFragment f52428b;

            {
                this.f52428b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i14 = i10;
                HelpFragment helpFragment = this.f52428b;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list2 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/qOnyU_cI8Zw", null, 12);
                        helpFragment.m9957n0("https://youtu.be/qOnyU_cI8Zw");
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list3 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/q9dVfNdKM_g", null, 12);
                        helpFragment.m9957n0("https://youtu.be/q9dVfNdKM_g");
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HelpFragment.f25033D0;
                        C5207g.m11111f(helpFragment, "this$0");
                        List<Integer> list4 = C6716m.f37937a;
                        C6716m.m13330o(helpFragment.m3578a0(), "https://youtu.be/LpKLlYgCYVs", null, 12);
                        helpFragment.m9957n0("https://youtu.be/LpKLlYgCYVs");
                        break;
                }
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m9957n0(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("video_url", str);
        C7796d c7796d = this.f25035B0;
        if (c7796d != null) {
            c7796d.m15505b(bundle, "opened_help_video");
        } else {
            C5207g.m11117l("analytics");
            throw null;
        }
    }
}
