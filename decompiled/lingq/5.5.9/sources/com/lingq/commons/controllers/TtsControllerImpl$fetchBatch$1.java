package com.lingq.commons.controllers;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Request;
import dm.C5207g;
import ge.C5789m;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$fetchBatch$1", m19206f = "TtsController.kt", m19207l = {154, 157, 161}, m19208m = "invokeSuspend")
public final class TtsControllerImpl$fetchBatch$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public TtsControllerImpl f16583e;

    /* JADX INFO: renamed from: f */
    public int f16584f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TtsControllerImpl f16585g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16586h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Set<String> f16587i;

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$fetchBatch$1$a */
    public static final class C3269a implements InterfaceC7117d<List<? extends TextToSpeechTokenUtterance>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TtsControllerImpl f16589a;

        public C3269a(TtsControllerImpl ttsControllerImpl) {
            this.f16589a = ttsControllerImpl;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(List<? extends TextToSpeechTokenUtterance> list, InterfaceC9968c interfaceC9968c) {
            TtsControllerImpl ttsControllerImpl = this.f16589a;
            Context context = ttsControllerImpl.f16570a;
            C5207g.m11111f(context, "context");
            File file = new File(C0166e.m765k(context.getFilesDir().toString(), "/tts/"));
            for (TextToSpeechTokenUtterance textToSpeechTokenUtterance : list) {
                String str = (String) C6752c.m13432Z(C7076b.m14299s3(textToSpeechTokenUtterance.f21611c, new String[]{"/"}, 0, 6));
                if (!new File(file + "/" + str).exists()) {
                    Uri uri = Uri.parse(textToSpeechTokenUtterance.f21611c);
                    Uri uri2 = Uri.parse(file + "/" + str);
                    String string = uri.toString();
                    C5207g.m11110e(string, "downloadUri.toString()");
                    String string2 = uri2.toString();
                    C5207g.m11110e(string2, "destinationUri.toString()");
                    Request request = new Request(string, string2);
                    Priority priority = Priority.NORMAL;
                    C5207g.m11112g(priority, "<set-?>");
                    request.f32312d = priority;
                    NetworkType networkType = NetworkType.ALL;
                    C5207g.m11112g(networkType, "<set-?>");
                    request.f32313e = networkType;
                    ttsControllerImpl.f16575f.mo10652b(request, new C5789m(0), new C0141b());
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchBatch$1(TtsControllerImpl ttsControllerImpl, String str, Set<String> set, InterfaceC9968c<? super TtsControllerImpl$fetchBatch$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16585g = ttsControllerImpl;
        this.f16586h = str;
        this.f16587i = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$fetchBatch$1(this.f16585g, this.f16586h, this.f16587i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$fetchBatch$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        C3269a c3269a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16584f;
        String str = this.f16586h;
        TtsControllerImpl ttsControllerImpl = this.f16585g;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                ttsControllerImpl = this.f16583e;
                C7499b.m14977z0(obj);
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new TtsControllerImpl$fetchBatch$1$1$1(null));
                c3269a = new C3269a(ttsControllerImpl);
                this.f16583e = null;
                this.f16584f = 3;
                if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.mo9539a(c3269a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2024q interfaceC2024q = ttsControllerImpl.f16573d;
        this.f16584f = 1;
        obj = interfaceC2024q.mo6176g(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        TextToSpeechAppVoice textToSpeechAppVoice = (TextToSpeechAppVoice) obj;
        if (textToSpeechAppVoice != null) {
            InterfaceC2024q interfaceC2024q2 = ttsControllerImpl.f16573d;
            this.f16583e = ttsControllerImpl;
            this.f16584f = 2;
            obj = interfaceC2024q2.mo6177h(str, this.f16587i, textToSpeechAppVoice);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new TtsControllerImpl$fetchBatch$1$1$1(null));
            c3269a = new C3269a(ttsControllerImpl);
            this.f16583e = null;
            this.f16584f = 3;
            if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.mo9539a(c3269a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
