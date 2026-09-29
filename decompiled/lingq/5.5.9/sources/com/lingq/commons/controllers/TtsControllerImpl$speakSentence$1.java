package com.lingq.commons.controllers;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$speakSentence$1", m19206f = "TtsController.kt", m19207l = {342}, m19208m = "invokeSuspend")
public final class TtsControllerImpl$speakSentence$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16657e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TtsControllerImpl f16658f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16659g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ double f16660h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Double f16661i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f16662j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$speakSentence$1(TtsControllerImpl ttsControllerImpl, int i10, double d10, Double d11, float f3, InterfaceC9968c<? super TtsControllerImpl$speakSentence$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16658f = ttsControllerImpl;
        this.f16659g = i10;
        this.f16660h = d10;
        this.f16661i = d11;
        this.f16662j = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$speakSentence$1(this.f16658f, this.f16659g, this.f16660h, this.f16661i, this.f16662j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$speakSentence$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16657e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            Context context = this.f16658f.f16570a;
            C5207g.m11111f(context, "context");
            StringBuilder sbM26o = C0009a.m26o(new File(C0166e.m765k(context.getFilesDir().toString(), "/tracks/")).toString(), "/");
            sbM26o.append(this.f16659g);
            sbM26o.append(".mp3");
            Uri uri = Uri.parse(sbM26o.toString());
            TtsControllerImpl ttsControllerImpl = this.f16658f;
            C5207g.m11110e(uri, "uri");
            double d10 = this.f16660h;
            Double d11 = this.f16661i;
            float f3 = this.f16662j;
            this.f16657e = 1;
            if (TtsControllerImpl.m9333d(ttsControllerImpl, uri, d10, d11, f3, this) == coroutineSingletons) {
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
