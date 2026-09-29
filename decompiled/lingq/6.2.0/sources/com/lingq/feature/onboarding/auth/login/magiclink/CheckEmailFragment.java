package com.lingq.feature.onboarding.auth.login.magiclink;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.onboarding.R$layout;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3440oy;
import p000.bh4;
import p000.c01;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.e01;
import p000.gr3;
import p000.ifa;
import p000.jfa;
import p000.lda;
import p000.od3;
import p000.or1;
import p000.rt3;
import p000.sq5;
import p000.ui3;
import p000.uq0;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckEmailFragment extends rt3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f27069G0 = {new PropertyReference1Impl(CheckEmailFragment.class, "binding", "getBinding()Lcom/lingq/feature/onboarding/databinding/FragmentCheckEmailBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f27070C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f27071D0;

    /* JADX INFO: renamed from: E0 */
    public final sq5 f27072E0;

    /* JADX INFO: renamed from: F0 */
    public int f27073F0;

    public CheckEmailFragment() {
        super(R$layout.fragment_check_email, 2);
        this.f27070C0 = jfa.m14432o(this, CheckEmailFragment$binding$2.f27074i);
        final CheckEmailFragment$special$$inlined$viewModels$default$1 checkEmailFragment$special$$inlined$viewModels$default$1 = new CheckEmailFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) checkEmailFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f27071D0 = new w41(y38.m24933a(e01.class), new ui3() { // from class: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27092b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        this.f27072E0 = new sq5(3, y38.m24933a(c01.class), new uq0(this, 2));
        this.f27073F0 = -1;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        C3440oy c3440oy = new C3440oy(this, 6);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3440oy);
        vz1.m23640l0(this);
        od3 od3VarM9113R0 = m9113R0();
        od3VarM9113R0.f54206d.setNavigationIcon(m2090R().getDrawable(R$drawable.ic_arrow_back));
        MaterialToolbar materialToolbar = od3VarM9113R0.f54206d;
        materialToolbar.setNavigationIconTint(jfa.m14431n(m2090R(), R$attr.colorOnSurface));
        final int i = 0;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a01

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CheckEmailFragment f10b;

            {
                this.f10b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                CheckEmailFragment checkEmailFragment = this.f10b;
                switch (i2) {
                    case 0:
                        bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
                        b34.m3244j(checkEmailFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = CheckEmailFragment.f27069G0;
                        ArrayList arrayList = new ArrayList();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        List<ResolveInfo> listQueryIntentActivities = checkEmailFragment.m2090R().getPackageManager().queryIntentActivities(intent, 131072);
                        listQueryIntentActivities.getClass();
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            arrayList.add(checkEmailFragment.m2090R().getPackageManager().getLaunchIntentForPackage(it.next().activityInfo.packageName));
                        }
                        Intent intent2 = new Intent();
                        Locale locale = Locale.getDefault();
                        String strM2111m = checkEmailFragment.m2111m(R$string.login_email_chooser);
                        strM2111m.getClass();
                        Intent intentCreateChooser = Intent.createChooser(intent2, String.format(locale, strM2111m, Arrays.copyOf(new Object[]{((c01) checkEmailFragment.f27072E0.getValue()).f9245a}, 1)));
                        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
                        checkEmailFragment.m2100a0(intentCreateChooser);
                        break;
                }
            }
        });
        TextView textView = od3VarM9113R0.f54207e;
        Locale locale = Locale.getDefault();
        String strM2111m = m2111m(R$string.login_tap_magic_link);
        strM2111m.getClass();
        sq5 sq5Var = this.f27072E0;
        final int i2 = 1;
        textView.setText(String.format(locale, strM2111m, Arrays.copyOf(new Object[]{((c01) sq5Var.getValue()).f9245a}, 1)));
        Locale locale2 = Locale.getDefault();
        String strM2111m2 = m2111m(R$string.login_tap_magic_link);
        strM2111m2.getClass();
        String str = String.format(locale2, strM2111m2, Arrays.copyOf(new Object[]{((c01) sq5Var.getValue()).f9245a}, 1));
        String str2 = ((c01) sq5Var.getValue()).f9245a;
        int i3 = com.lingq.core.designsystem.R$attr.blueStrongColor;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iM23389l0 = vk9.m23389l0(str, str2, 0, false, 6);
        int length = str2.length() + iM23389l0;
        if (iM23389l0 == -1) {
            length = str.length();
        } else {
            i = iM23389l0;
        }
        spannableStringBuilder.setSpan(new ifa(), i, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
        Context context = textView.getContext();
        context.getClass();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(jfa.m14431n(context, i3)), i, length, 33);
        textView.setText(spannableStringBuilder);
        od3VarM9113R0.f54203a.setOnClickListener(new View.OnClickListener(this) { // from class: a01

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CheckEmailFragment f10b;

            {
                this.f10b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                CheckEmailFragment checkEmailFragment = this.f10b;
                switch (i4) {
                    case 0:
                        bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
                        b34.m3244j(checkEmailFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = CheckEmailFragment.f27069G0;
                        ArrayList arrayList = new ArrayList();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        List<ResolveInfo> listQueryIntentActivities = checkEmailFragment.m2090R().getPackageManager().queryIntentActivities(intent, 131072);
                        listQueryIntentActivities.getClass();
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            arrayList.add(checkEmailFragment.m2090R().getPackageManager().getLaunchIntentForPackage(it.next().activityInfo.packageName));
                        }
                        Intent intent2 = new Intent();
                        Locale locale3 = Locale.getDefault();
                        String strM2111m3 = checkEmailFragment.m2111m(R$string.login_email_chooser);
                        strM2111m3.getClass();
                        Intent intentCreateChooser = Intent.createChooser(intent2, String.format(locale3, strM2111m3, Arrays.copyOf(new Object[]{((c01) checkEmailFragment.f27072E0.getValue()).f9245a}, 1)));
                        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
                        checkEmailFragment.m2100a0(intentCreateChooser);
                        break;
                }
            }
        });
        od3VarM9113R0.f54204b.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.onboarding.auth.login.magiclink.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
                e01 e01Var = (e01) this.f27111a.f27071D0.getValue();
                wfb.m23926u(lda.m16103C(e01Var), e01Var.f36479c, null, new CheckEmailViewModel$resendMessage$1(e01Var, null), 2);
            }
        });
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2178x68123247(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final od3 m9113R0() {
        return (od3) this.f27070C0.getValue(this, f27069G0[0]);
    }
}
