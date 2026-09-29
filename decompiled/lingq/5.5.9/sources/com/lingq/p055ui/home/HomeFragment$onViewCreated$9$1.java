package com.lingq.p055ui.home;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.C0141b;
import android.widget.ArrayAdapter;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import me.C7544b;
import me.C7550h;
import ni.C7796d;
import ni.C7797e;
import no.InterfaceC7882z;
import p155he.C6041e;
import p225kk.C6716m;
import p260m8.C7499b;
import p290o6.CallableC7964k;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$1", m19206f = "HomeFragment.kt", m19207l = {216}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22687e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22688f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Profile;", "profile", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$1$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34671 extends SuspendLambda implements InterfaceC2056p<Profile, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22689e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22690f;

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$1$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ HomeFragment f22691a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Profile f22692b;

            public a(HomeFragment homeFragment, Profile profile) {
                this.f22691a = homeFragment;
                this.f22692b = profile;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Integer numValueOf;
                String str = this.f22692b.f17796p;
                InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                HomeFragment homeFragment = this.f22691a;
                C9249b c9249b = new C9249b(homeFragment.m3578a0());
                List<Integer> list = C6716m.f37937a;
                c9249b.setTitle(C6716m.m13320e(R.string.settings_dictionary_languages, homeFragment));
                c9249b.m17610c(C6716m.m13320e(R.string.ui_cancel, homeFragment), new DialogInterface.OnClickListener() { // from class: ri.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i11) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = HomeFragment.f22653M0;
                        dialogInterface2.dismiss();
                    }
                });
                List list2 = (List) homeFragment.m9770s0().f22742R.getValue();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (C5207g.m11106a(((UserDictionaryLocale) it.next()).f21721a, str)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    numValueOf = Integer.valueOf(i11);
                } else {
                    numValueOf = null;
                }
                ArrayAdapter<String> arrayAdapter = homeFragment.f22657D0;
                if (arrayAdapter == null) {
                    C5207g.m11117l("localesAdapter");
                    throw null;
                }
                c9249b.m17613f(arrayAdapter, (numValueOf != null ? numValueOf.intValue() : 0) + 1, new DialogInterfaceOnClickListenerC8634f(1, homeFragment));
                c9249b.m876a();
                homeFragment.m9768q0().f37891b.edit().putBoolean("checked_for_dictionary_3", true).apply();
                homeFragment.f22658E0 = false;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$1$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ HomeFragment f22693a;

            public b(HomeFragment homeFragment) {
                this.f22693a = homeFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeFragment homeFragment = this.f22693a;
                homeFragment.m9768q0().f37891b.edit().putBoolean("checked_for_dictionary_3", true).apply();
                homeFragment.f22658E0 = false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34671(HomeFragment homeFragment, InterfaceC9968c<? super C34671> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22690f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34671 c34671 = new C34671(this.f22690f, interfaceC9968c);
            c34671.f22689e = obj;
            return c34671;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34671) mo1336a(profile, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Profile profile = (Profile) this.f22689e;
            int i10 = profile.f17781a;
            if (i10 != 0) {
                C7796d c7796d = this.f22690f.f22660G0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                c7796d.m15506c(sb2.toString());
                C7796d c7796d2 = this.f22690f.f22660G0;
                if (c7796d2 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d2.m15507d("app", "LingQ");
                HomeFragment homeFragment = this.f22690f;
                C7796d c7796d3 = homeFragment.f22660G0;
                if (c7796d3 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d3.m15507d("is_premium", homeFragment.m9770s0().mo502f0() ? "yes" : "no");
                boolean zEquals = false;
                if (C5207g.m11106a(profile.f17796p, profile.f17795o) && !this.f22690f.m9768q0().f37891b.getBoolean("checked_for_dictionary_3", false)) {
                    HomeFragment homeFragment2 = this.f22690f;
                    if (!homeFragment2.f22658E0) {
                        if (homeFragment2.m9770s0().mo9741p0(TooltipStep.Finished)) {
                            C9249b c9249b = new C9249b(this.f22690f.m3578a0());
                            c9249b.setTitle(this.f22690f.m3600t(R.string.card_check_dictionary));
                            Locale locale = Locale.getDefault();
                            String strM3600t = this.f22690f.m3600t(R.string.texts_learning_matches_dictionary);
                            C5207g.m11110e(strM3600t, "getString(R.string.texts…rning_matches_dictionary)");
                            c9249b.f599a.f579f = C0141b.m613i(new Object[]{C4924a.m10439R(this.f22690f.m3578a0(), profile.f17795o)}, 1, locale, strM3600t, "format(locale, format, *args)");
                            c9249b.m17612e(this.f22690f.m3600t(R.string.ui_yes), new a(this.f22690f, profile));
                            c9249b.m17610c(this.f22690f.m3600t(R.string.ui_no), new b(this.f22690f));
                            c9249b.m876a();
                        }
                        this.f22690f.f22658E0 = true;
                    }
                }
                C7797e c7797e = this.f22690f.f22659F0;
                if (c7797e == null) {
                    C5207g.m11117l("utils");
                    throw null;
                }
                if (!c7797e.m15513f()) {
                    C6041e c6041eM12476a = C6041e.m12476a();
                    int i11 = profile.f17781a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11);
                    String string = sb3.toString();
                    C7550h c7550h = c6041eM12476a.f35688a.f41100g.f16208d;
                    c7550h.getClass();
                    String strM15052a = C7544b.m15052a(string, 1024);
                    synchronized (c7550h.f41653f) {
                        try {
                            String reference = c7550h.f41653f.getReference();
                            if (strM15052a != null) {
                                zEquals = strM15052a.equals(reference);
                            } else if (reference == null) {
                                zEquals = true;
                            }
                            if (!zEquals) {
                                c7550h.f41653f.set(strM15052a, true);
                                c7550h.f41649b.m14749a(new CallableC7964k(1, c7550h));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                C7796d c7796d4 = this.f22690f.f22660G0;
                if (c7796d4 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d4.m15505b(null, "show_home_screen");
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$1(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22688f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$1(this.f22688f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22687e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22688f;
            InterfaceC7116c<Profile> interfaceC7116cMo504j1 = homeFragment.m9770s0().mo504j1();
            C34671 c34671 = new C34671(homeFragment, null);
            this.f22687e = 1;
            if (C0062b.m369m0(interfaceC7116cMo504j1, c34671, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
