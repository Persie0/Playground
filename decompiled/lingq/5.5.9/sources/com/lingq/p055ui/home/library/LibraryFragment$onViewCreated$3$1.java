package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$1", m19206f = "LibraryFragment.kt", m19207l = {333}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24672e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24673f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$1$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37661 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24674e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24675f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37661(LibraryFragment libraryFragment, InterfaceC9968c<? super C37661> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24675f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37661 c37661 = new C37661(this.f24675f, interfaceC9968c);
            c37661.f24674e = obj;
            return c37661;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37661) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguage userLanguage = (UserLanguage) this.f24674e;
            if (userLanguage != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                LibraryFragment libraryFragment = this.f24675f;
                TextView textView = libraryFragment.m9936q0().f45345j;
                Context contextM3578a0 = libraryFragment.m3578a0();
                String str = userLanguage.f21726a;
                textView.setText(C4924a.m10439R(contextM3578a0, str));
                List<Integer> list = C6716m.f37937a;
                ImageView imageView = libraryFragment.m9936q0().f45341f;
                if (imageView != null) {
                    if (C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        str = "zh_t";
                    }
                    int identifier = imageView.getContext().getResources().getIdentifier("ic_flag_".concat(str), "drawable", imageView.getContext().getPackageName());
                    if (identifier != 0) {
                        C4924a.m10436O(imageView, Integer.valueOf(identifier), 1.0f, null, 12);
                    } else {
                        C4924a.m10436O(imageView, Integer.valueOf(R.drawable.ic_flag_beta), 1.0f, null, 12);
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$1(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24673f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$1(this.f24673f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24672e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24673f;
            InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = libraryFragment.m9938s0().mo509w0();
            C37661 c37661 = new C37661(libraryFragment, null);
            this.f24672e = 1;
            if (C0062b.m369m0(interfaceC7142wMo509w0, c37661, this) == coroutineSingletons) {
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
