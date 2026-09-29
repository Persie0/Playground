package com.lingq.commons.controllers;

import android.content.Context;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import dm.C5207g;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$speak$1", m19206f = "TtsController.kt", m19207l = {235, 237, 240, 245, 247, 255, 258, 259}, m19208m = "invokeSuspend")
public final class TtsControllerImpl$speak$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f16645H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ String f16646I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f16647J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ float f16648K;

    /* JADX INFO: renamed from: e */
    public Object f16649e;

    /* JADX INFO: renamed from: f */
    public TtsControllerImpl f16650f;

    /* JADX INFO: renamed from: g */
    public String f16651g;

    /* JADX INFO: renamed from: h */
    public String f16652h;

    /* JADX INFO: renamed from: i */
    public boolean f16653i;

    /* JADX INFO: renamed from: j */
    public float f16654j;

    /* JADX INFO: renamed from: k */
    public int f16655k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TtsControllerImpl f16656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$speak$1(TtsControllerImpl ttsControllerImpl, String str, String str2, boolean z10, float f3, InterfaceC9968c<? super TtsControllerImpl$speak$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16656l = ttsControllerImpl;
        this.f16645H = str;
        this.f16646I = str2;
        this.f16647J = z10;
        this.f16648K = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$speak$1(this.f16656l, this.f16645H, this.f16646I, this.f16647J, this.f16648K, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$speak$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM14360a;
        TtsControllerImpl ttsControllerImpl;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        String str;
        Voice voiceM9340f;
        Object objM14360a2;
        TextToSpeech textToSpeech;
        Object objMo6176g;
        TextToSpeechAppVoice textToSpeechAppVoice;
        float f3;
        Object objMo6178i;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        String str2;
        String str3;
        TextToSpeechAppVoice textToSpeechAppVoice2;
        String str4;
        TtsControllerImpl ttsControllerImpl2;
        float f10;
        String str5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16655k;
        String str6 = this.f16646I;
        boolean z10 = this.f16647J;
        String str7 = this.f16645H;
        TtsControllerImpl ttsControllerImpl3 = this.f16656l;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> interfaceC7116cMo9595j = ttsControllerImpl3.f16574e.mo9595j();
                this.f16649e = ttsControllerImpl3;
                this.f16655k = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9595j, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ttsControllerImpl = ttsControllerImpl3;
                localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM14360a).get(str7);
                if (localTextToSpeechVoice != null || (str = localTextToSpeechVoice.f21601a) == null) {
                    str = "";
                }
                voiceM9340f = ttsControllerImpl.m9340f(str);
                if (voiceM9340f == null) {
                    textToSpeech = ttsControllerImpl3.f16577h;
                    if (textToSpeech != null) {
                        voiceM9340f = textToSpeech.getDefaultVoice();
                    } else {
                        voiceM9340f = null;
                    }
                }
                PreferenceStoreImpl$special$$inlined$map$8 preferenceStoreImpl$special$$inlined$map$8Mo9583b0 = ttsControllerImpl3.f16574e.mo9583b0();
                this.f16649e = voiceM9340f;
                this.f16655k = 2;
                objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$8Mo9583b0, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!(true ^ ((Boolean) objM14360a2).booleanValue()) && voiceM9340f != null) {
                    this.f16649e = null;
                    this.f16655k = 3;
                    if (ttsControllerImpl3.m9341g(str7, str6, 1.0f, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (ttsControllerImpl3.f16569L || !z10) {
                    this.f16649e = null;
                    this.f16655k = 4;
                    objMo6176g = ttsControllerImpl3.f16573d.mo6176g(str7, this);
                    if (objMo6176g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                    if (textToSpeechAppVoice != null) {
                        InterfaceC2024q interfaceC2024q = ttsControllerImpl3.f16573d;
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16653i = z10;
                        f3 = this.f16648K;
                        this.f16654j = f3;
                        this.f16655k = 5;
                        objMo6178i = interfaceC2024q.mo6178i(str7, str6, textToSpeechAppVoice, this);
                        if (objMo6178i == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                        if (textToSpeechTokenUtterance != null || (str5 = textToSpeechTokenUtterance.f21611c) == null) {
                            str2 = null;
                        } else {
                            str2 = (String) C6752c.m13432Z(C7076b.m14299s3(str5, new String[]{"/"}, 0, 6));
                        }
                        Context context = ttsControllerImpl3.f16570a;
                        C5207g.m11111f(context, "context");
                        File file = new File(new File(C0166e.m765k(context.getFilesDir().toString(), "/tts/")) + "/" + str2);
                        if (textToSpeechTokenUtterance != null || !file.exists()) {
                            this.f16649e = textToSpeechAppVoice;
                            this.f16650f = ttsControllerImpl3;
                            this.f16651g = str7;
                            this.f16652h = str6;
                            this.f16654j = f3;
                            this.f16655k = 7;
                            if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str3 = str6;
                            textToSpeechAppVoice2 = textToSpeechAppVoice;
                            str4 = str7;
                            ttsControllerImpl2 = ttsControllerImpl3;
                            f10 = f3;
                            this.f16649e = null;
                            this.f16650f = null;
                            this.f16651g = null;
                            this.f16652h = null;
                            this.f16655k = 8;
                            if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if ((!C5207g.m11106a(str6, ttsControllerImpl3.f16568K) || z10) && !ttsControllerImpl3.f16569L) {
                            ttsControllerImpl3.f16567J = str6;
                            Uri uri = Uri.parse(file.toString());
                            C5207g.m11110e(uri, "parse(file.toString())");
                            boolean zM14278X2 = C7076b.m14278X2(str6, " ", false);
                            this.f16649e = null;
                            this.f16650f = null;
                            this.f16651g = null;
                            this.f16652h = null;
                            this.f16655k = 6;
                            if (TtsControllerImpl.m9332b(ttsControllerImpl3, uri, zM14278X2, f3, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    TextToSpeech textToSpeech2 = ttsControllerImpl3.f16577h;
                    if (textToSpeech2 != null) {
                        new Integer(textToSpeech2.stop());
                    }
                    ttsControllerImpl3.f16569L = false;
                }
                return C9072e.f47360a;
            case 1:
                TtsControllerImpl ttsControllerImpl4 = (TtsControllerImpl) this.f16649e;
                C7499b.m14977z0(obj);
                ttsControllerImpl = ttsControllerImpl4;
                objM14360a = obj;
                localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM14360a).get(str7);
                if (localTextToSpeechVoice != null) {
                    str = "";
                } else {
                    str = "";
                }
                voiceM9340f = ttsControllerImpl.m9340f(str);
                if (voiceM9340f == null) {
                    textToSpeech = ttsControllerImpl3.f16577h;
                    if (textToSpeech != null) {
                        voiceM9340f = textToSpeech.getDefaultVoice();
                    } else {
                        voiceM9340f = null;
                    }
                }
                PreferenceStoreImpl$special$$inlined$map$8 preferenceStoreImpl$special$$inlined$map$8Mo9583b1 = ttsControllerImpl3.f16574e.mo9583b0();
                this.f16649e = voiceM9340f;
                this.f16655k = 2;
                objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$8Mo9583b1, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!(true ^ ((Boolean) objM14360a2).booleanValue())) {
                    if (ttsControllerImpl3.f16569L) {
                    }
                    this.f16649e = null;
                    this.f16655k = 4;
                    objMo6176g = ttsControllerImpl3.f16573d.mo6176g(str7, this);
                    if (objMo6176g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                    if (textToSpeechAppVoice != null) {
                        InterfaceC2024q interfaceC2024q2 = ttsControllerImpl3.f16573d;
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16653i = z10;
                        f3 = this.f16648K;
                        this.f16654j = f3;
                        this.f16655k = 5;
                        objMo6178i = interfaceC2024q2.mo6178i(str7, str6, textToSpeechAppVoice, this);
                        if (objMo6178i == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                        if (textToSpeechTokenUtterance != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        Context context2 = ttsControllerImpl3.f16570a;
                        C5207g.m11111f(context2, "context");
                        File file2 = new File(new File(C0166e.m765k(context2.getFilesDir().toString(), "/tts/")) + "/" + str2);
                        if (textToSpeechTokenUtterance != null) {
                        }
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16654j = f3;
                        this.f16655k = 7;
                        if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str6;
                        textToSpeechAppVoice2 = textToSpeechAppVoice;
                        str4 = str7;
                        ttsControllerImpl2 = ttsControllerImpl3;
                        f10 = f3;
                        this.f16649e = null;
                        this.f16650f = null;
                        this.f16651g = null;
                        this.f16652h = null;
                        this.f16655k = 8;
                        if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    break;
                } else {
                    if (ttsControllerImpl3.f16569L) {
                    }
                    this.f16649e = null;
                    this.f16655k = 4;
                    objMo6176g = ttsControllerImpl3.f16573d.mo6176g(str7, this);
                    if (objMo6176g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                    if (textToSpeechAppVoice != null) {
                        InterfaceC2024q interfaceC2024q3 = ttsControllerImpl3.f16573d;
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16653i = z10;
                        f3 = this.f16648K;
                        this.f16654j = f3;
                        this.f16655k = 5;
                        objMo6178i = interfaceC2024q3.mo6178i(str7, str6, textToSpeechAppVoice, this);
                        if (objMo6178i == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                        if (textToSpeechTokenUtterance != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        Context context3 = ttsControllerImpl3.f16570a;
                        C5207g.m11111f(context3, "context");
                        File file3 = new File(new File(C0166e.m765k(context3.getFilesDir().toString(), "/tts/")) + "/" + str2);
                        if (textToSpeechTokenUtterance != null) {
                        }
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16654j = f3;
                        this.f16655k = 7;
                        if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str6;
                        textToSpeechAppVoice2 = textToSpeechAppVoice;
                        str4 = str7;
                        ttsControllerImpl2 = ttsControllerImpl3;
                        f10 = f3;
                        this.f16649e = null;
                        this.f16650f = null;
                        this.f16651g = null;
                        this.f16652h = null;
                        this.f16655k = 8;
                        if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    break;
                }
                return C9072e.f47360a;
            case 2:
                voiceM9340f = (Voice) this.f16649e;
                C7499b.m14977z0(obj);
                objM14360a2 = obj;
                if (!(true ^ ((Boolean) objM14360a2).booleanValue())) {
                    if (ttsControllerImpl3.f16569L) {
                    }
                    this.f16649e = null;
                    this.f16655k = 4;
                    objMo6176g = ttsControllerImpl3.f16573d.mo6176g(str7, this);
                    if (objMo6176g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                    if (textToSpeechAppVoice != null) {
                        InterfaceC2024q interfaceC2024q4 = ttsControllerImpl3.f16573d;
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16653i = z10;
                        f3 = this.f16648K;
                        this.f16654j = f3;
                        this.f16655k = 5;
                        objMo6178i = interfaceC2024q4.mo6178i(str7, str6, textToSpeechAppVoice, this);
                        if (objMo6178i == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                        if (textToSpeechTokenUtterance != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        Context context4 = ttsControllerImpl3.f16570a;
                        C5207g.m11111f(context4, "context");
                        File file4 = new File(new File(C0166e.m765k(context4.getFilesDir().toString(), "/tts/")) + "/" + str2);
                        if (textToSpeechTokenUtterance != null) {
                        }
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16654j = f3;
                        this.f16655k = 7;
                        if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str6;
                        textToSpeechAppVoice2 = textToSpeechAppVoice;
                        str4 = str7;
                        ttsControllerImpl2 = ttsControllerImpl3;
                        f10 = f3;
                        this.f16649e = null;
                        this.f16650f = null;
                        this.f16651g = null;
                        this.f16652h = null;
                        this.f16655k = 8;
                        if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    break;
                } else {
                    if (ttsControllerImpl3.f16569L) {
                    }
                    this.f16649e = null;
                    this.f16655k = 4;
                    objMo6176g = ttsControllerImpl3.f16573d.mo6176g(str7, this);
                    if (objMo6176g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                    if (textToSpeechAppVoice != null) {
                        InterfaceC2024q interfaceC2024q5 = ttsControllerImpl3.f16573d;
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16653i = z10;
                        f3 = this.f16648K;
                        this.f16654j = f3;
                        this.f16655k = 5;
                        objMo6178i = interfaceC2024q5.mo6178i(str7, str6, textToSpeechAppVoice, this);
                        if (objMo6178i == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                        if (textToSpeechTokenUtterance != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        Context context5 = ttsControllerImpl3.f16570a;
                        C5207g.m11111f(context5, "context");
                        File file5 = new File(new File(C0166e.m765k(context5.getFilesDir().toString(), "/tts/")) + "/" + str2);
                        if (textToSpeechTokenUtterance != null) {
                        }
                        this.f16649e = textToSpeechAppVoice;
                        this.f16650f = ttsControllerImpl3;
                        this.f16651g = str7;
                        this.f16652h = str6;
                        this.f16654j = f3;
                        this.f16655k = 7;
                        if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str6;
                        textToSpeechAppVoice2 = textToSpeechAppVoice;
                        str4 = str7;
                        ttsControllerImpl2 = ttsControllerImpl3;
                        f10 = f3;
                        this.f16649e = null;
                        this.f16650f = null;
                        this.f16651g = null;
                        this.f16652h = null;
                        this.f16655k = 8;
                        if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    break;
                }
                return C9072e.f47360a;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            case 4:
                C7499b.m14977z0(obj);
                objMo6176g = obj;
                textToSpeechAppVoice = (TextToSpeechAppVoice) objMo6176g;
                if (textToSpeechAppVoice != null) {
                    InterfaceC2024q interfaceC2024q6 = ttsControllerImpl3.f16573d;
                    this.f16649e = textToSpeechAppVoice;
                    this.f16650f = ttsControllerImpl3;
                    this.f16651g = str7;
                    this.f16652h = str6;
                    this.f16653i = z10;
                    f3 = this.f16648K;
                    this.f16654j = f3;
                    this.f16655k = 5;
                    objMo6178i = interfaceC2024q6.mo6178i(str7, str6, textToSpeechAppVoice, this);
                    if (objMo6178i == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                    if (textToSpeechTokenUtterance != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    Context context6 = ttsControllerImpl3.f16570a;
                    C5207g.m11111f(context6, "context");
                    File file6 = new File(new File(C0166e.m765k(context6.getFilesDir().toString(), "/tts/")) + "/" + str2);
                    if (textToSpeechTokenUtterance != null) {
                    }
                    this.f16649e = textToSpeechAppVoice;
                    this.f16650f = ttsControllerImpl3;
                    this.f16651g = str7;
                    this.f16652h = str6;
                    this.f16654j = f3;
                    this.f16655k = 7;
                    if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str6;
                    textToSpeechAppVoice2 = textToSpeechAppVoice;
                    str4 = str7;
                    ttsControllerImpl2 = ttsControllerImpl3;
                    f10 = f3;
                    this.f16649e = null;
                    this.f16650f = null;
                    this.f16651g = null;
                    this.f16652h = null;
                    this.f16655k = 8;
                    if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                }
                return C9072e.f47360a;
            case 5:
                float f11 = this.f16654j;
                z10 = this.f16653i;
                str6 = this.f16652h;
                str7 = this.f16651g;
                ttsControllerImpl3 = this.f16650f;
                textToSpeechAppVoice = (TextToSpeechAppVoice) this.f16649e;
                C7499b.m14977z0(obj);
                f3 = f11;
                objMo6178i = obj;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo6178i;
                if (textToSpeechTokenUtterance != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                Context context7 = ttsControllerImpl3.f16570a;
                C5207g.m11111f(context7, "context");
                File file7 = new File(new File(C0166e.m765k(context7.getFilesDir().toString(), "/tts/")) + "/" + str2);
                if (textToSpeechTokenUtterance != null) {
                    break;
                }
                this.f16649e = textToSpeechAppVoice;
                this.f16650f = ttsControllerImpl3;
                this.f16651g = str7;
                this.f16652h = str6;
                this.f16654j = f3;
                this.f16655k = 7;
                if (TtsControllerImpl.m9334e(ttsControllerImpl3, str7, str6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str3 = str6;
                textToSpeechAppVoice2 = textToSpeechAppVoice;
                str4 = str7;
                ttsControllerImpl2 = ttsControllerImpl3;
                f10 = f3;
                this.f16649e = null;
                this.f16650f = null;
                this.f16651g = null;
                this.f16652h = null;
                this.f16655k = 8;
                if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                float f12 = this.f16654j;
                String str8 = this.f16652h;
                String str9 = this.f16651g;
                TtsControllerImpl ttsControllerImpl5 = this.f16650f;
                TextToSpeechAppVoice textToSpeechAppVoice3 = (TextToSpeechAppVoice) this.f16649e;
                C7499b.m14977z0(obj);
                f10 = f12;
                ttsControllerImpl2 = ttsControllerImpl5;
                textToSpeechAppVoice2 = textToSpeechAppVoice3;
                str3 = str8;
                str4 = str9;
                this.f16649e = null;
                this.f16650f = null;
                this.f16651g = null;
                this.f16652h = null;
                this.f16655k = 8;
                if (TtsControllerImpl.m9331a(ttsControllerImpl2, str4, str3, textToSpeechAppVoice2, f10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
