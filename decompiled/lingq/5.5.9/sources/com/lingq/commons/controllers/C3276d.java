package com.lingq.commons.controllers;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.util.C4924a;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Request;
import dm.C5207g;
import ge.C5789m;
import java.io.File;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p122fl.InterfaceC5581d;
import p122fl.InterfaceC5585h;
import p244lh.C7373j;
import p463wk.InterfaceC9958a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.commons.controllers.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3276d implements InterfaceC7117d<Resource<? extends TextToSpeechTokenUtterance>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TtsControllerImpl f16705a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f16708d;

    public C3276d(TtsControllerImpl ttsControllerImpl, String str, String str2, float f3) {
        this.f16705a = ttsControllerImpl;
        this.f16706b = str;
        this.f16707c = str2;
        this.f16708d = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(Resource<? extends TextToSpeechTokenUtterance> resource, InterfaceC9968c interfaceC9968c) {
        Object objM9341g;
        Resource<? extends TextToSpeechTokenUtterance> resource2 = resource;
        final TextToSpeechTokenUtterance textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) resource2.f17863b;
        if (textToSpeechTokenUtterance != null) {
            final TtsControllerImpl ttsControllerImpl = this.f16705a;
            final String str = this.f16706b;
            final String str2 = this.f16707c;
            final float f3 = this.f16708d;
            InterfaceC2052l<Integer, C9072e> interfaceC2052l = new InterfaceC2052l<Integer, C9072e>() { // from class: com.lingq.commons.controllers.TtsControllerImpl$fetchUtterance$3$emit$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Integer num) {
                    if (num.intValue() == textToSpeechTokenUtterance.f21610b) {
                        C4924a.m10450b(ttsControllerImpl.f16565H);
                        InterfaceC3275c.a.m9347b(ttsControllerImpl, str, str2, false, f3, 4);
                    }
                    return C9072e.f47360a;
                }
            };
            ttsControllerImpl.getClass();
            String str3 = textToSpeechTokenUtterance.f21611c;
            String str4 = (String) C6752c.m13432Z(C7076b.m14299s3(str3, new String[]{"/"}, 0, 6));
            Context context = ttsControllerImpl.f16570a;
            C5207g.m11111f(context, "context");
            File file = new File(C0166e.m765k(context.getFilesDir().toString(), "/tts/"));
            final File file2 = new File(file + "/" + str4 + "-temp");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file);
            sb2.append("/");
            sb2.append(str4);
            File file3 = new File(sb2.toString());
            if (!file2.exists() || !file3.exists()) {
                Uri uri = Uri.parse(str3);
                Uri uri2 = Uri.parse(file + "/" + str4 + "-temp");
                String string = uri.toString();
                C5207g.m11110e(string, "downloadUri.toString()");
                String string2 = uri2.toString();
                C5207g.m11110e(string2, "destinationUri.toString()");
                Request request = new Request(string, string2);
                InterfaceC5581d[] interfaceC5581dArr = {new C7373j(file2, file3, interfaceC2052l, textToSpeechTokenUtterance, ttsControllerImpl, request)};
                InterfaceC9958a interfaceC9958a = ttsControllerImpl.f16575f;
                interfaceC9958a.mo10651a(request.f32307k, interfaceC5581dArr);
                Priority priority = Priority.HIGH;
                C5207g.m11112g(priority, "<set-?>");
                request.f32312d = priority;
                NetworkType networkType = NetworkType.ALL;
                C5207g.m11112g(networkType, "<set-?>");
                request.f32313e = networkType;
                interfaceC9958a.mo10652b(request, new C5789m(1), new InterfaceC5585h() { // from class: lh.h
                    @Override // p122fl.InterfaceC5585h
                    /* JADX INFO: renamed from: d */
                    public final void mo520d(Object obj) {
                        File file4 = file2;
                        C5207g.m11111f(file4, "$tempFile");
                        C5207g.m11111f((Error) obj, "error");
                        file4.delete();
                    }
                });
            }
        }
        return (C3304a.m9438a(resource2) && (objM9341g = this.f16705a.m9341g(this.f16706b, this.f16707c, this.f16708d, interfaceC9968c)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM9341g : C9072e.f47360a;
    }
}
