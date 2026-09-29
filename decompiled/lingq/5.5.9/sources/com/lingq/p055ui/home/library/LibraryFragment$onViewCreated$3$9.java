package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.linguist.R;
import dm.C5207g;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$9", m19206f = "LibraryFragment.kt", m19207l = {461}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24718f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$9$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$9$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37761 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24719e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24720f;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$9$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LibraryFragment f24721a;

            public a(LibraryFragment libraryFragment) {
                this.f24721a = libraryFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                LibraryViewModel libraryViewModelM9938s0 = this.f24721a.m9938s0();
                C7138s c7138s = libraryViewModelM9938s0.f24770f0;
                UserLanguage value = libraryViewModelM9938s0.mo509w0().getValue();
                if (value == null || (str = value.f21734i) == null) {
                    str = "en";
                }
                c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/learn/", libraryViewModelM9938s0.mo498E1(), "/web/settings/points"));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$9$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f24722a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37761(LibraryFragment libraryFragment, InterfaceC9968c<? super C37761> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24720f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37761 c37761 = new C37761(this.f24720f, interfaceC9968c);
            c37761.f24719e = obj;
            return c37761;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends Integer> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37761) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24719e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            int iIntValue2 = ((Number) pair.f38013b).intValue();
            LibraryFragment libraryFragment = this.f24720f;
            C9249b c9249b = new C9249b(libraryFragment.m3578a0());
            c9249b.setTitle(libraryFragment.m3600t(R.string.premium_lesson));
            Locale locale = Locale.getDefault();
            String strM3600t = libraryFragment.m3600t(R.string.not_enough_balance_purchase_lesson_details);
            C5207g.m11110e(strM3600t, "getString(R.string.not_e…_purchase_lesson_details)");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(libraryFragment.m3600t(R.string.ui_buy_points), new a(libraryFragment));
            c9249b.m17610c(libraryFragment.m3600t(R.string.ui_cancel), b.f24722a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$9(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24718f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$9(this.f24718f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24717e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24718f;
            LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
            C37761 c37761 = new C37761(libraryFragment, null);
            this.f24717e = 1;
            if (C0062b.m369m0(libraryViewModelM9938s0.f24768e0, c37761, this) == coroutineSingletons) {
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
