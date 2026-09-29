package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.widget.ImageButton;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$3", m19206f = "DictionaryContentFragment.kt", m19207l = {213}, m19208m = "invokeSuspend")
public final class DictionaryContentFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionaryContentFragment f31890f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "hasTTS", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$3$1", m19206f = "DictionaryContentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49011 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31891e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionaryContentFragment f31892f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49011(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super C49011> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31892f = dictionaryContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C49011 c49011 = new C49011(this.f31892f, interfaceC9968c);
            c49011.f31891e = obj;
            return c49011;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49011) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean zM11106a = C5207g.m11106a((Boolean) this.f31891e, Boolean.TRUE);
            DictionaryContentFragment dictionaryContentFragment = this.f31892f;
            if (zM11106a) {
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                ImageButton imageButton = dictionaryContentFragment.m10396u0().f44876d;
                C5207g.m11110e(imageButton, "binding.btnTts");
                C4924a.m10457e0(imageButton);
            } else {
                DictionaryContentFragment.C4892a c4892a2 = DictionaryContentFragment.f31854X0;
                ImageButton imageButton2 = dictionaryContentFragment.m10396u0().f44876d;
                C5207g.m11110e(imageButton2, "binding.btnTts");
                C4924a.m10442U(imageButton2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentFragment$onViewCreated$3$3(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super DictionaryContentFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31890f = dictionaryContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionaryContentFragment$onViewCreated$3$3(this.f31890f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionaryContentFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31889e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment dictionaryContentFragment = this.f31890f;
            TokenViewModel tokenViewModelM10397v0 = dictionaryContentFragment.m10397v0();
            C49011 c49011 = new C49011(dictionaryContentFragment, null);
            this.f31889e = 1;
            if (C0062b.m369m0(tokenViewModelM10397v0.f31436W0, c49011, this) == coroutineSingletons) {
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
