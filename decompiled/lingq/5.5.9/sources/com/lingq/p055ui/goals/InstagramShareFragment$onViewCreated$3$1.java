package com.lingq.p055ui.goals;

import ae.C0062b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$1", m19206f = "InstagramShareFragment.kt", m19207l = {123}, m19208m = "invokeSuspend")
public final class InstagramShareFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22634e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InstagramShareFragment f22635f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "title", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$1$1", m19206f = "InstagramShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34581 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22636e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InstagramShareFragment f22637f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34581(InstagramShareFragment instagramShareFragment, InterfaceC9968c<? super C34581> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22637f = instagramShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34581 c34581 = new C34581(this.f22637f, interfaceC9968c);
            c34581.f22636e = obj;
            return c34581;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34581) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ClipData clipDataNewPlainText = ClipData.newPlainText("LingQ", (String) this.f22636e);
            InstagramShareFragment instagramShareFragment = this.f22637f;
            ClipboardManager clipboardManager = instagramShareFragment.f22621S0;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            Toast.makeText(instagramShareFragment.m3578a0(), instagramShareFragment.m3600t(R.string.share_copied_clipboard), 0).show();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramShareFragment$onViewCreated$3$1(InstagramShareFragment instagramShareFragment, InterfaceC9968c<? super InstagramShareFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22635f = instagramShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InstagramShareFragment$onViewCreated$3$1(this.f22635f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InstagramShareFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22634e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
            InstagramShareFragment instagramShareFragment = this.f22635f;
            InstagramShareViewModel instagramShareViewModelM9764v0 = instagramShareFragment.m9764v0();
            C34581 c34581 = new C34581(instagramShareFragment, null);
            this.f22634e = 1;
            if (C0062b.m369m0(instagramShareViewModelM9764v0.f22650f, c34581, this) == coroutineSingletons) {
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
