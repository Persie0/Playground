package com.lingq.shared.repository;

import androidx.room.RoomDatabaseKt;
import bi.AbstractC1485m5;
import ci.InterfaceC2024q;
import com.lingq.entity.TtsUtterance;
import com.lingq.shared.network.result.ResultTtsUtterance;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p076di.InterfaceC5179a;
import p260m8.C7499b;
import p385sf.C9000b;
import p460wh.InterfaceC9949q;
import p464wl.InterfaceC9968c;
import p511yh.C10367d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TtsRepositoryImpl implements InterfaceC2024q {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f20564a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1485m5 f20565b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9949q f20566c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5179a f20567d;

    public TtsRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1485m5 abstractC1485m5, InterfaceC9949q interfaceC9949q, InterfaceC5179a interfaceC5179a) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1485m5, "ttsDao");
        C5207g.m11111f(interfaceC9949q, "ttsService");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        this.f20564a = lingQDatabase;
        this.f20565b = abstractC1485m5;
        this.f20566c = interfaceC9949q;
        this.f20567d = interfaceC5179a;
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c mo6170a(String str) {
        return this.f20565b.mo5105o0(str);
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: b */
    public final C7136q mo6171b(String str, boolean z10) {
        return new C7136q(new TtsRepositoryImpl$observableTtsVoices$2(z10, this, str, null));
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: c */
    public final C7136q mo6172c(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice) {
        return new C7136q(new TtsRepositoryImpl$fetchUtterance$2(str, str2, textToSpeechAppVoice, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: d */
    public final Object mo6173d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        TtsRepositoryImpl$updateTtsVoices$1 ttsRepositoryImpl$updateTtsVoices$1;
        TtsRepositoryImpl ttsRepositoryImpl;
        if (interfaceC9968c instanceof TtsRepositoryImpl$updateTtsVoices$1) {
            ttsRepositoryImpl$updateTtsVoices$1 = (TtsRepositoryImpl$updateTtsVoices$1) interfaceC9968c;
            int i10 = ttsRepositoryImpl$updateTtsVoices$1.f20612h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$updateTtsVoices$1.f20612h = i10 - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$updateTtsVoices$1 = new TtsRepositoryImpl$updateTtsVoices$1(this, interfaceC9968c);
            }
        } else {
            ttsRepositoryImpl$updateTtsVoices$1 = new TtsRepositoryImpl$updateTtsVoices$1(this, interfaceC9968c);
        }
        Object objM18527a = ttsRepositoryImpl$updateTtsVoices$1.f20610f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsRepositoryImpl$updateTtsVoices$1.f20612h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = ttsRepositoryImpl$updateTtsVoices$1.f20609e;
                ttsRepositoryImpl = ttsRepositoryImpl$updateTtsVoices$1.f20608d;
                C7499b.m14977z0(objM18527a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18527a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18527a);
        ttsRepositoryImpl$updateTtsVoices$1.f20608d = this;
        ttsRepositoryImpl$updateTtsVoices$1.f20609e = str;
        ttsRepositoryImpl$updateTtsVoices$1.f20612h = 1;
        objM18527a = this.f20566c.m18527a(str, ttsRepositoryImpl$updateTtsVoices$1);
        if (objM18527a == coroutineSingletons) {
            return coroutineSingletons;
        }
        ttsRepositoryImpl = this;
        LingQDatabase lingQDatabase = ttsRepositoryImpl.f20564a;
        TtsRepositoryImpl$updateTtsVoices$2 ttsRepositoryImpl$updateTtsVoices$2 = new TtsRepositoryImpl$updateTtsVoices$2(ttsRepositoryImpl, (List) objM18527a, str, null);
        ttsRepositoryImpl$updateTtsVoices$1.f20608d = null;
        ttsRepositoryImpl$updateTtsVoices$1.f20609e = null;
        ttsRepositoryImpl$updateTtsVoices$1.f20612h = 2;
        if (RoomDatabaseKt.m4573a(lingQDatabase, ttsRepositoryImpl$updateTtsVoices$2, ttsRepositoryImpl$updateTtsVoices$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: e */
    public final Object mo6174e(String str, InterfaceC9968c<? super TextToSpeechVoice> interfaceC9968c) {
        return this.f20565b.mo5101k0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0110 A[Catch: Exception -> 0x0114, TRY_LEAVE, TryCatch #0 {Exception -> 0x0114, blocks: (B:45:0x010c, B:47:0x0110, B:42:0x00fd, B:39:0x00dd, B:35:0x00d2), top: B:54:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0114 A[PHI: r3
      0x0114: PHI (r3v2 ??) = (r3v1 ??), (r3v8 ??), (r3v9 ??) binds: [B:49:0x0113, B:53:0x0114, B:46:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.shared.repository.TtsRepositoryImpl, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: f */
    public final Object mo6175f(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, InterfaceC9968c<? super String> interfaceC9968c) throws Throwable {
        TtsRepositoryImpl$fetchUtterancesForSentence$1 ttsRepositoryImpl$fetchUtterancesForSentence$1;
        ?? r10;
        ?? r11;
        Locale localeForLanguageTag;
        Object objMo5103m0;
        TtsRepositoryImpl ttsRepositoryImpl;
        String str3;
        String str4;
        Object obj;
        String str5;
        TtsRepositoryImpl ttsRepositoryImpl2;
        String str6;
        ?? r12;
        AbstractC1485m5 abstractC1485m5;
        List<TtsUtterance> listM17251q;
        ?? r13;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        String str7 = str2;
        TextToSpeechAppVoice textToSpeechAppVoice2 = textToSpeechAppVoice;
        if (interfaceC9968c instanceof TtsRepositoryImpl$fetchUtterancesForSentence$1) {
            ttsRepositoryImpl$fetchUtterancesForSentence$1 = (TtsRepositoryImpl$fetchUtterancesForSentence$1) interfaceC9968c;
            int i10 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = i10 - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$fetchUtterancesForSentence$1 = new TtsRepositoryImpl$fetchUtterancesForSentence$1(this, interfaceC9968c);
            }
        } else {
            ttsRepositoryImpl$fetchUtterancesForSentence$1 = new TtsRepositoryImpl$fetchUtterancesForSentence$1(this, interfaceC9968c);
        }
        Object objMo5103m1 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20596j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    str4 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20595i;
                    Locale locale = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20594h;
                    textToSpeechAppVoice2 = (TextToSpeechAppVoice) ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g;
                    String str8 = (String) ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f;
                    String str9 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e;
                    TtsRepositoryImpl ttsRepositoryImpl3 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d;
                    C7499b.m14977z0(objMo5103m1);
                    ttsRepositoryImpl = ttsRepositoryImpl3;
                    str3 = str9;
                    objMo5103m0 = objMo5103m1;
                    localeForLanguageTag = locale;
                    str7 = str8;
                } else if (i11 == 2) {
                    str4 = (String) ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g;
                    Locale locale2 = (Locale) ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f;
                    String str10 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e;
                    TtsRepositoryImpl ttsRepositoryImpl4 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d;
                    C7499b.m14977z0(objMo5103m1);
                    obj = objMo5103m1;
                    localeForLanguageTag = locale2;
                    ttsRepositoryImpl2 = ttsRepositoryImpl4;
                    str5 = str10;
                    r12 = 0;
                    abstractC1485m5 = ttsRepositoryImpl2.f20565b;
                    C5207g.m11110e(localeForLanguageTag, "locale");
                    listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) obj, localeForLanguageTag, str5));
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = ttsRepositoryImpl2;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = str4;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f = r12;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g = r12;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 3;
                    r13 = r12;
                    if (abstractC1485m5.mo5107q0(listM17251q, ttsRepositoryImpl$fetchUtterancesForSentence$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl2.f20565b;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = r13;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = r13;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 4;
                    objMo5103m1 = abstractC1485m6.mo5103m0(str4, ttsRepositoryImpl$fetchUtterancesForSentence$1);
                    r10 = r13;
                    if (objMo5103m1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i11 == 3) {
                    str4 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e;
                    ttsRepositoryImpl2 = ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d;
                    C7499b.m14977z0(objMo5103m1);
                    r13 = 0;
                    AbstractC1485m5 abstractC1485m7 = ttsRepositoryImpl2.f20565b;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = r13;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = r13;
                    ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 4;
                    objMo5103m1 = abstractC1485m7.mo5103m0(str4, ttsRepositoryImpl$fetchUtterancesForSentence$1);
                    r10 = r13;
                    if (objMo5103m1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objMo5103m1);
                    r10 = 0;
                }
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo5103m1;
                if (textToSpeechTokenUtterance != null) {
                    r11 = textToSpeechTokenUtterance.f21611c;
                } else {
                    r11 = r10;
                }
                return r11;
            }
            C7499b.m14977z0(objMo5103m1);
            localeForLanguageTag = Locale.forLanguageTag(str);
            C5207g.m11110e(localeForLanguageTag, "locale");
            String strM9701a = TextToSpeechTokenUtterance.C3401a.m9701a(localeForLanguageTag, str, str7, textToSpeechAppVoice2.f21606b, textToSpeechAppVoice2.f21605a);
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = this;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = str;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f = str7;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g = textToSpeechAppVoice2;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20594h = localeForLanguageTag;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20595i = strM9701a;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 1;
            objMo5103m0 = this.f20565b.mo5103m0(strM9701a, ttsRepositoryImpl$fetchUtterancesForSentence$1);
            if (objMo5103m0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ttsRepositoryImpl = this;
            str3 = str;
            str4 = strM9701a;
            TextToSpeechTokenUtterance textToSpeechTokenUtterance2 = (TextToSpeechTokenUtterance) objMo5103m0;
            if (textToSpeechTokenUtterance2 != null && (str6 = textToSpeechTokenUtterance2.f21611c) != null) {
                return str6;
            }
            InterfaceC9949q interfaceC9949q = ttsRepositoryImpl.f20566c;
            String str11 = textToSpeechAppVoice2.f21606b;
            String str12 = textToSpeechAppVoice2.f21605a;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = ttsRepositoryImpl;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = str7;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f = localeForLanguageTag;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g = str4;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20594h = null;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20595i = null;
            ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 2;
            TtsRepositoryImpl ttsRepositoryImpl5 = ttsRepositoryImpl;
            r10 = 0;
            try {
                Object objM18528b = interfaceC9949q.m18528b(str3, str7, str11, str12, ttsRepositoryImpl$fetchUtterancesForSentence$1);
                if (objM18528b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objM18528b;
                str5 = str7;
                ttsRepositoryImpl2 = ttsRepositoryImpl5;
                r12 = r10;
                abstractC1485m5 = ttsRepositoryImpl2.f20565b;
                C5207g.m11110e(localeForLanguageTag, "locale");
                listM17251q = C9000b.m17251q(C10367d.m19388a((ResultTtsUtterance) obj, localeForLanguageTag, str5));
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = ttsRepositoryImpl2;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = str4;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20592f = r12;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20593g = r12;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 3;
                r13 = r12;
                if (abstractC1485m5.mo5107q0(listM17251q, ttsRepositoryImpl$fetchUtterancesForSentence$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                AbstractC1485m5 abstractC1485m8 = ttsRepositoryImpl2.f20565b;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20590d = r13;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20591e = r13;
                ttsRepositoryImpl$fetchUtterancesForSentence$1.f20598l = 4;
                objMo5103m1 = abstractC1485m8.mo5103m0(str4, ttsRepositoryImpl$fetchUtterancesForSentence$1);
                r10 = r13;
                if (objMo5103m1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objMo5103m1;
                if (textToSpeechTokenUtterance != null) {
                    r11 = textToSpeechTokenUtterance.f21611c;
                } else {
                    r11 = r10;
                }
                return r11;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            r10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:46:0x0106->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: g */
    public final Object mo6176g(String str, InterfaceC9968c<? super TextToSpeechAppVoice> interfaceC9968c) throws Throwable {
        TtsRepositoryImpl$fetchPriorityVoice$1 ttsRepositoryImpl$fetchPriorityVoice$1;
        TtsRepositoryImpl ttsRepositoryImpl;
        String str2;
        LinkedHashMap linkedHashMap;
        TtsRepositoryImpl ttsRepositoryImpl2;
        TextToSpeechVoice textToSpeechVoice;
        InterfaceC5179a interfaceC5179a;
        TextToSpeechVoice textToSpeechVoice2;
        if (interfaceC9968c instanceof TtsRepositoryImpl$fetchPriorityVoice$1) {
            ttsRepositoryImpl$fetchPriorityVoice$1 = (TtsRepositoryImpl$fetchPriorityVoice$1) interfaceC9968c;
            int i10 = ttsRepositoryImpl$fetchPriorityVoice$1.f20573i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$fetchPriorityVoice$1.f20573i = i10 - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$fetchPriorityVoice$1 = new TtsRepositoryImpl$fetchPriorityVoice$1(this, interfaceC9968c);
            }
        } else {
            ttsRepositoryImpl$fetchPriorityVoice$1 = new TtsRepositoryImpl$fetchPriorityVoice$1(this, interfaceC9968c);
        }
        Object objM14360a = ttsRepositoryImpl$fetchPriorityVoice$1.f20571g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsRepositoryImpl$fetchPriorityVoice$1.f20573i;
        if (i11 != 0) {
            if (i11 == 1) {
                str = ttsRepositoryImpl$fetchPriorityVoice$1.f20569e;
                ttsRepositoryImpl = (TtsRepositoryImpl) ttsRepositoryImpl$fetchPriorityVoice$1.f20568d;
                C7499b.m14977z0(objM14360a);
            } else if (i11 == 2) {
                linkedHashMap = ttsRepositoryImpl$fetchPriorityVoice$1.f20570f;
                str2 = ttsRepositoryImpl$fetchPriorityVoice$1.f20569e;
                ttsRepositoryImpl2 = (TtsRepositoryImpl) ttsRepositoryImpl$fetchPriorityVoice$1.f20568d;
                C7499b.m14977z0(objM14360a);
                textToSpeechVoice = (TextToSpeechVoice) objM14360a;
                if (textToSpeechVoice != null) {
                    return null;
                }
                linkedHashMap.put(str2, textToSpeechVoice);
                interfaceC5179a = ttsRepositoryImpl2.f20567d;
                ttsRepositoryImpl$fetchPriorityVoice$1.f20568d = textToSpeechVoice;
                ttsRepositoryImpl$fetchPriorityVoice$1.f20569e = null;
                ttsRepositoryImpl$fetchPriorityVoice$1.f20570f = null;
                ttsRepositoryImpl$fetchPriorityVoice$1.f20573i = 3;
                if (interfaceC5179a.mo9590f(linkedHashMap, ttsRepositoryImpl$fetchPriorityVoice$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                textToSpeechVoice2 = textToSpeechVoice;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textToSpeechVoice2 = (TextToSpeechVoice) ttsRepositoryImpl$fetchPriorityVoice$1.f20568d;
                C7499b.m14977z0(objM14360a);
            }
            for (TextToSpeechAppVoice textToSpeechAppVoice : textToSpeechVoice2.f21618c) {
                if (C5207g.m11106a(textToSpeechAppVoice.f21606b, C6752c.m13423Q(textToSpeechVoice2.f21620e))) {
                    return textToSpeechAppVoice;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, TextToSpeechVoice>> interfaceC7116cMo9562I = this.f20567d.mo9562I();
        ttsRepositoryImpl$fetchPriorityVoice$1.f20568d = this;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20569e = str;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20573i = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9562I, ttsRepositoryImpl$fetchPriorityVoice$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        ttsRepositoryImpl = this;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
        TextToSpeechVoice textToSpeechVoice3 = (TextToSpeechVoice) linkedHashMapM13467T0.get(str);
        if (textToSpeechVoice3 != null) {
            for (TextToSpeechAppVoice textToSpeechAppVoice2 : textToSpeechVoice3.f21618c) {
                if (C5207g.m11106a(textToSpeechAppVoice2.f21606b, C6752c.m13423Q(textToSpeechVoice3.f21620e))) {
                    return textToSpeechAppVoice2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        AbstractC1485m5 abstractC1485m5 = ttsRepositoryImpl.f20565b;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20568d = ttsRepositoryImpl;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20569e = str;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20570f = linkedHashMapM13467T0;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20573i = 2;
        Object objMo5101k0 = abstractC1485m5.mo5101k0(str, ttsRepositoryImpl$fetchPriorityVoice$1);
        if (objMo5101k0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        TtsRepositoryImpl ttsRepositoryImpl3 = ttsRepositoryImpl;
        str2 = str;
        linkedHashMap = linkedHashMapM13467T0;
        objM14360a = objMo5101k0;
        ttsRepositoryImpl2 = ttsRepositoryImpl3;
        textToSpeechVoice = (TextToSpeechVoice) objM14360a;
        if (textToSpeechVoice != null) {
            return null;
        }
        linkedHashMap.put(str2, textToSpeechVoice);
        interfaceC5179a = ttsRepositoryImpl2.f20567d;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20568d = textToSpeechVoice;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20569e = null;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20570f = null;
        ttsRepositoryImpl$fetchPriorityVoice$1.f20573i = 3;
        if (interfaceC5179a.mo9590f(linkedHashMap, ttsRepositoryImpl$fetchPriorityVoice$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        textToSpeechVoice2 = textToSpeechVoice;
        while (r10.hasNext()) {
            if (C5207g.m11106a(textToSpeechAppVoice.f21606b, C6752c.m13423Q(textToSpeechVoice2.f21620e))) {
                return textToSpeechAppVoice;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: h */
    public final C7136q mo6177h(String str, Set set, TextToSpeechAppVoice textToSpeechAppVoice) {
        return new C7136q(new TtsRepositoryImpl$fetchUtterances$2(str, this, set, textToSpeechAppVoice, null));
    }

    @Override // ci.InterfaceC2024q
    /* JADX INFO: renamed from: i */
    public final Object mo6178i(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, InterfaceC9968c<? super TextToSpeechTokenUtterance> interfaceC9968c) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        C5207g.m11110e(localeForLanguageTag, "locale");
        return this.f20565b.mo5103m0(TextToSpeechTokenUtterance.C3401a.m9701a(localeForLanguageTag, str, str2, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a), interfaceC9968c);
    }
}
