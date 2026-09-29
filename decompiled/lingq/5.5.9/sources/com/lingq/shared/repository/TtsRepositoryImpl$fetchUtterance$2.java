package com.lingq.shared.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import bi.AbstractC1485m5;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TtsUtterance;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultTtsUtterance;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p385sf.C9000b;
import p460wh.InterfaceC9949q;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p511yh.C10367d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/uimodel/TextToSpeechTokenUtterance;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl$fetchUtterance$2", m19206f = "TtsRepository.kt", m19207l = {219, 228, 232, 234, 240, 244, 242}, m19208m = "invokeSuspend")
final class TtsRepositoryImpl$fetchUtterance$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends TextToSpeechTokenUtterance>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Object f20574e;

    /* JADX INFO: renamed from: f */
    public String f20575f;

    /* JADX INFO: renamed from: g */
    public int f20576g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20577h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20578i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20579j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TextToSpeechAppVoice f20580k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TtsRepositoryImpl f20581l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchUtterance$2(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, TtsRepositoryImpl ttsRepositoryImpl, InterfaceC9968c<? super TtsRepositoryImpl$fetchUtterance$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20578i = str;
        this.f20579j = str2;
        this.f20580k = textToSpeechAppVoice;
        this.f20581l = ttsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        TtsRepositoryImpl$fetchUtterance$2 ttsRepositoryImpl$fetchUtterance$2 = new TtsRepositoryImpl$fetchUtterance$2(this.f20578i, this.f20579j, this.f20580k, this.f20581l, interfaceC9968c);
        ttsRepositoryImpl$fetchUtterance$2.f20577h = obj;
        return ttsRepositoryImpl$fetchUtterance$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends TextToSpeechTokenUtterance>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsRepositoryImpl$fetchUtterance$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0135 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        Locale localeForLanguageTag;
        String strM9701a;
        Object objMo5103m0;
        InterfaceC7117d interfaceC7117d2;
        String str;
        Locale locale;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        Object objM18528b;
        Locale locale2;
        InterfaceC7117d interfaceC7117d3;
        Resource resourceM9437c;
        AbstractC1485m5 abstractC1485m5;
        List<TtsUtterance> listM17251q;
        InterfaceC7117d interfaceC7117d4;
        String str2;
        Resource.C3303a c3303a;
        Object objMo5103m1;
        Resource resourceM9437c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20576g;
        String str3 = this.f20579j;
        TextToSpeechAppVoice textToSpeechAppVoice = this.f20580k;
        TtsRepositoryImpl ttsRepositoryImpl = this.f20581l;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                interfaceC7117d = (InterfaceC7117d) this.f20577h;
                Resource.f17861d.getClass();
                Resource resource = new Resource(Resource.Status.LOADING, null, null);
                this.f20577h = interfaceC7117d;
                this.f20576g = 1;
                if (interfaceC7117d.mo1339r(resource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str4 = this.f20578i;
                localeForLanguageTag = Locale.forLanguageTag(str4);
                C5207g.m11110e(localeForLanguageTag, "locale");
                strM9701a = TextToSpeechTokenUtterance.C3401a.m9701a(localeForLanguageTag, str4, str3, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a);
                AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl.f20565b;
                this.f20577h = interfaceC7117d;
                this.f20574e = localeForLanguageTag;
                this.f20575f = strM9701a;
                this.f20576g = 2;
                objMo5103m0 = abstractC1485m6.mo5103m0(strM9701a, this);
                if (objMo5103m0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC7117d2 = interfaceC7117d;
                str = strM9701a;
                locale = localeForLanguageTag;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo5103m0;
                if (textToSpeechTokenUtterance != null) {
                    Resource.f17861d.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(textToSpeechTokenUtterance);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20575f = null;
                    this.f20576g = 3;
                    if (interfaceC7117d2.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    InterfaceC9949q interfaceC9949q = ttsRepositoryImpl.f20566c;
                    String str5 = this.f20578i;
                    String str6 = this.f20579j;
                    String str7 = textToSpeechAppVoice.f21606b;
                    String str8 = textToSpeechAppVoice.f21605a;
                    this.f20577h = interfaceC7117d2;
                    this.f20574e = locale;
                    this.f20575f = str;
                    this.f20576g = 4;
                    objM18528b = interfaceC9949q.m18528b(str5, str6, str7, str8, this);
                    if (objM18528b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    locale2 = locale;
                    interfaceC7117d3 = interfaceC7117d2;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    C5207g.m11110e(locale2, "locale");
                    listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) objM18528b, locale2, str3));
                    this.f20577h = interfaceC7117d3;
                    this.f20574e = str;
                    this.f20575f = null;
                    this.f20576g = 5;
                    if (abstractC1485m5.mo5107q0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d4 = interfaceC7117d3;
                    str2 = str;
                    c3303a = Resource.f17861d;
                    AbstractC1485m5 abstractC1485m7 = ttsRepositoryImpl.f20565b;
                    this.f20577h = interfaceC7117d4;
                    this.f20574e = c3303a;
                    this.f20576g = 6;
                    objMo5103m1 = abstractC1485m7.mo5103m0(str2, this);
                    if (objMo5103m1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a.getClass();
                    resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20576g = 7;
                    if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 1:
                interfaceC7117d = (InterfaceC7117d) this.f20577h;
                C7499b.m14977z0(obj);
                String str9 = this.f20578i;
                localeForLanguageTag = Locale.forLanguageTag(str9);
                C5207g.m11110e(localeForLanguageTag, "locale");
                strM9701a = TextToSpeechTokenUtterance.C3401a.m9701a(localeForLanguageTag, str9, str3, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a);
                AbstractC1485m5 abstractC1485m8 = ttsRepositoryImpl.f20565b;
                this.f20577h = interfaceC7117d;
                this.f20574e = localeForLanguageTag;
                this.f20575f = strM9701a;
                this.f20576g = 2;
                objMo5103m0 = abstractC1485m8.mo5103m0(strM9701a, this);
                if (objMo5103m0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC7117d2 = interfaceC7117d;
                str = strM9701a;
                locale = localeForLanguageTag;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo5103m0;
                if (textToSpeechTokenUtterance != null) {
                    Resource.f17861d.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(textToSpeechTokenUtterance);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20575f = null;
                    this.f20576g = 3;
                    if (interfaceC7117d2.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    InterfaceC9949q interfaceC9949q2 = ttsRepositoryImpl.f20566c;
                    String str10 = this.f20578i;
                    String str11 = this.f20579j;
                    String str12 = textToSpeechAppVoice.f21606b;
                    String str13 = textToSpeechAppVoice.f21605a;
                    this.f20577h = interfaceC7117d2;
                    this.f20574e = locale;
                    this.f20575f = str;
                    this.f20576g = 4;
                    objM18528b = interfaceC9949q2.m18528b(str10, str11, str12, str13, this);
                    if (objM18528b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    locale2 = locale;
                    interfaceC7117d3 = interfaceC7117d2;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    C5207g.m11110e(locale2, "locale");
                    listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) objM18528b, locale2, str3));
                    this.f20577h = interfaceC7117d3;
                    this.f20574e = str;
                    this.f20575f = null;
                    this.f20576g = 5;
                    if (abstractC1485m5.mo5107q0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d4 = interfaceC7117d3;
                    str2 = str;
                    c3303a = Resource.f17861d;
                    AbstractC1485m5 abstractC1485m9 = ttsRepositoryImpl.f20565b;
                    this.f20577h = interfaceC7117d4;
                    this.f20574e = c3303a;
                    this.f20576g = 6;
                    objMo5103m1 = abstractC1485m9.mo5103m0(str2, this);
                    if (objMo5103m1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a.getClass();
                    resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20576g = 7;
                    if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 2:
                String str14 = this.f20575f;
                Locale locale3 = (Locale) this.f20574e;
                InterfaceC7117d interfaceC7117d5 = (InterfaceC7117d) this.f20577h;
                C7499b.m14977z0(obj);
                objMo5103m0 = obj;
                str = str14;
                locale = locale3;
                interfaceC7117d2 = interfaceC7117d5;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo5103m0;
                if (textToSpeechTokenUtterance != null) {
                    Resource.f17861d.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(textToSpeechTokenUtterance);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20575f = null;
                    this.f20576g = 3;
                    if (interfaceC7117d2.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    InterfaceC9949q interfaceC9949q3 = ttsRepositoryImpl.f20566c;
                    String str15 = this.f20578i;
                    String str16 = this.f20579j;
                    String str17 = textToSpeechAppVoice.f21606b;
                    String str18 = textToSpeechAppVoice.f21605a;
                    this.f20577h = interfaceC7117d2;
                    this.f20574e = locale;
                    this.f20575f = str;
                    this.f20576g = 4;
                    objM18528b = interfaceC9949q3.m18528b(str15, str16, str17, str18, this);
                    if (objM18528b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    locale2 = locale;
                    interfaceC7117d3 = interfaceC7117d2;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    C5207g.m11110e(locale2, "locale");
                    listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) objM18528b, locale2, str3));
                    this.f20577h = interfaceC7117d3;
                    this.f20574e = str;
                    this.f20575f = null;
                    this.f20576g = 5;
                    if (abstractC1485m5.mo5107q0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d4 = interfaceC7117d3;
                    str2 = str;
                    c3303a = Resource.f17861d;
                    AbstractC1485m5 abstractC1485m10 = ttsRepositoryImpl.f20565b;
                    this.f20577h = interfaceC7117d4;
                    this.f20574e = c3303a;
                    this.f20576g = 6;
                    objMo5103m1 = abstractC1485m10.mo5103m0(str2, this);
                    if (objMo5103m1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a.getClass();
                    resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                    this.f20577h = null;
                    this.f20574e = null;
                    this.f20576g = 7;
                    if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 3:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            case 4:
                String str19 = this.f20575f;
                locale2 = (Locale) this.f20574e;
                interfaceC7117d3 = (InterfaceC7117d) this.f20577h;
                C7499b.m14977z0(obj);
                str = str19;
                objM18528b = obj;
                abstractC1485m5 = ttsRepositoryImpl.f20565b;
                C5207g.m11110e(locale2, "locale");
                listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) objM18528b, locale2, str3));
                this.f20577h = interfaceC7117d3;
                this.f20574e = str;
                this.f20575f = null;
                this.f20576g = 5;
                if (abstractC1485m5.mo5107q0(listM17251q, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC7117d4 = interfaceC7117d3;
                str2 = str;
                c3303a = Resource.f17861d;
                AbstractC1485m5 abstractC1485m11 = ttsRepositoryImpl.f20565b;
                this.f20577h = interfaceC7117d4;
                this.f20574e = c3303a;
                this.f20576g = 6;
                objMo5103m1 = abstractC1485m11.mo5103m0(str2, this);
                if (objMo5103m1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c3303a.getClass();
                resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                this.f20577h = null;
                this.f20574e = null;
                this.f20576g = 7;
                if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 5:
                str2 = (String) this.f20574e;
                interfaceC7117d4 = (InterfaceC7117d) this.f20577h;
                C7499b.m14977z0(obj);
                c3303a = Resource.f17861d;
                AbstractC1485m5 abstractC1485m12 = ttsRepositoryImpl.f20565b;
                this.f20577h = interfaceC7117d4;
                this.f20574e = c3303a;
                this.f20576g = 6;
                objMo5103m1 = abstractC1485m12.mo5103m0(str2, this);
                if (objMo5103m1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c3303a.getClass();
                resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                this.f20577h = null;
                this.f20574e = null;
                this.f20576g = 7;
                if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Resource.C3303a c3303a2 = (Resource.C3303a) this.f20574e;
                interfaceC7117d4 = (InterfaceC7117d) this.f20577h;
                C7499b.m14977z0(obj);
                c3303a = c3303a2;
                objMo5103m1 = obj;
                c3303a.getClass();
                resourceM9437c2 = Resource.C3303a.m9437c(objMo5103m1);
                this.f20577h = null;
                this.f20574e = null;
                this.f20576g = 7;
                if (interfaceC7117d4.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
