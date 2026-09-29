package com.lingq.core.settings;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.settings.domain.C1862a;
import com.lingq.core.settings.domain.C1863b;
import com.lingq.core.settings.domain.C1867f;
import com.lingq.core.settings.domain.C1869h;
import com.lingq.core.settings.domain.C1871j;
import com.lingq.core.settings.reader.C1879a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3540rl;
import p000.a39;
import p000.b29;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.ci8;
import p000.cl9;
import p000.cma;
import p000.eh9;
import p000.em3;
import p000.fa4;
import p000.lda;
import p000.lt6;
import p000.m83;
import p000.nl8;
import p000.nn1;
import p000.oz8;
import p000.rm3;
import p000.sca;
import p000.sz7;
import p000.tz7;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.xi9;
import p000.y29;
import p000.yd7;
import p000.z19;
import p000.z29;

/* JADX INFO: renamed from: com.lingq.core.settings.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1859b extends wta implements cma, bia {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f22720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bia f22721c;

    /* JADX INFO: renamed from: d */
    public final C1879a f22722d;

    /* JADX INFO: renamed from: e */
    public final C1871j f22723e;

    /* JADX INFO: renamed from: f */
    public final em3 f22724f;

    /* JADX INFO: renamed from: g */
    public final C1867f f22725g;

    /* JADX INFO: renamed from: h */
    public final C1862a f22726h;

    /* JADX INFO: renamed from: i */
    public final oz8 f22727i;

    /* JADX INFO: renamed from: j */
    public final rm3 f22728j;

    /* JADX INFO: renamed from: k */
    public final C1867f f22729k;

    /* JADX INFO: renamed from: l */
    public final C1869h f22730l;

    /* JADX INFO: renamed from: m */
    public final C1862a f22731m;

    /* JADX INFO: renamed from: n */
    public final C1863b f22732n;

    /* JADX INFO: renamed from: o */
    public final nn1 f22733o;

    /* JADX INFO: renamed from: p */
    public final C3244l f22734p;

    /* JADX INFO: renamed from: q */
    public final C3244l f22735q;

    /* JADX INFO: renamed from: r */
    public final C3244l f22736r;

    /* JADX INFO: renamed from: s */
    public final C3244l f22737s;

    /* JADX INFO: renamed from: t */
    public final c18 f22738t;

    public C1859b(C1879a c1879a, C1871j c1871j, em3 em3Var, C1867f c1867f, C1862a c1862a, oz8 oz8Var, rm3 rm3Var, C1867f c1867f2, C1869h c1869h, C1862a c1862a2, C1863b c1863b, nn1 nn1Var, cma cmaVar, bia biaVar, nl8 nl8Var) {
        cmaVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f22720b = cmaVar;
        this.f22721c = biaVar;
        this.f22722d = c1879a;
        this.f22723e = c1871j;
        this.f22724f = em3Var;
        this.f22725g = c1867f;
        this.f22726h = c1862a;
        this.f22727i = oz8Var;
        this.f22728j = rm3Var;
        this.f22729k = c1867f2;
        this.f22730l = c1869h;
        this.f22731m = c1862a2;
        this.f22732n = c1863b;
        this.f22733o = nn1Var;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f22734p = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f22735q = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f22736r = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f22737s = c3244lM17114d4;
        this.f22738t = AbstractC3224d.m15520B(AbstractC3224d.m15531j(AbstractC3224d.m15530i(c1879a.m8654c(), c1879a.m8657f(), c1879a.m8656e(), c1879a.m8655d(), ((C1368a) c1879a.f23068a).f18413h1, new ReaderSettingsViewModel$_lessonSettings$1(this, null)), c3244lM17114d, new wz0(23, c1879a.m8652a(), this), AbstractC3224d.m15532k(c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, new ReaderSettingsViewModel$state$1(4, null)), new ReaderSettingsViewModel$state$2(5, null)), lda.m16103C(this), xi9.f68262a, new sz7(emptyList, null, emptyList, null));
        AbstractC3224d.m15545x(new m83(new C3540rl(cmaVar.mo4572B0(), 5), new ReaderSettingsViewModel$1(this, null), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderSettingsViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReaderSettingsViewModel$3(this, null), 2);
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReaderSettingsViewModel$4(this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: V2 */
    public static final Serializable m8610V2(C1859b c1859b, ViewKeys viewKeys, ContinuationImpl continuationImpl) throws Throwable {
        ReaderSettingsViewModel$buildDictionaryLocaleItems$1 readerSettingsViewModel$buildDictionaryLocaleItems$1;
        Set set;
        ViewKeys viewKeys2;
        c1859b.getClass();
        if (continuationImpl instanceof ReaderSettingsViewModel$buildDictionaryLocaleItems$1) {
            readerSettingsViewModel$buildDictionaryLocaleItems$1 = (ReaderSettingsViewModel$buildDictionaryLocaleItems$1) continuationImpl;
            int i = readerSettingsViewModel$buildDictionaryLocaleItems$1.f22583e;
            if ((i & Integer.MIN_VALUE) != 0) {
                readerSettingsViewModel$buildDictionaryLocaleItems$1.f22583e = i - Integer.MIN_VALUE;
            } else {
                readerSettingsViewModel$buildDictionaryLocaleItems$1 = new ReaderSettingsViewModel$buildDictionaryLocaleItems$1(c1859b, continuationImpl);
            }
        } else {
            readerSettingsViewModel$buildDictionaryLocaleItems$1 = new ReaderSettingsViewModel$buildDictionaryLocaleItems$1(c1859b, continuationImpl);
        }
        Object obj = readerSettingsViewModel$buildDictionaryLocaleItems$1.f22581c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = readerSettingsViewModel$buildDictionaryLocaleItems$1.f22583e;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            List list = ((sz7) ((C3244l) c1859b.f22738t.f9311a).getValue()).f61674a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof b29) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((b29) it.next()).f7805b);
            }
            Set setM22627s1 = u91.m22627s1(arrayList2);
            C3228h c3228hM8653b = c1859b.f22722d.m8653b();
            readerSettingsViewModel$buildDictionaryLocaleItems$1.f22579a = viewKeys;
            readerSettingsViewModel$buildDictionaryLocaleItems$1.f22580b = setM22627s1;
            readerSettingsViewModel$buildDictionaryLocaleItems$1.f22583e = 1;
            Object objM15541t = AbstractC3224d.m15541t(c3228hM8653b, readerSettingsViewModel$buildDictionaryLocaleItems$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            set = setM22627s1;
            obj = objM15541t;
            viewKeys2 = viewKeys;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = readerSettingsViewModel$buildDictionaryLocaleItems$1.f22580b;
            ViewKeys viewKeys3 = readerSettingsViewModel$buildDictionaryLocaleItems$1.f22579a;
            AbstractC3193b.m15359b(obj);
            viewKeys2 = viewKeys3;
        }
        Iterable iterable = (Iterable) ((Pair) obj).f47623a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : iterable) {
            if (!set.contains(((DictionaryLocale) obj3).f19021a)) {
                arrayList3.add(obj3);
            }
        }
        List<DictionaryLocale> listM22614f1 = u91.m22614f1(arrayList3, new lt6(c1859b, i3));
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(listM22614f1, 10));
        for (DictionaryLocale dictionaryLocale : listM22614f1) {
            arrayList4.add(new y29(0, 112, viewKeys2, m8613Y2(dictionaryLocale.f19021a), dictionaryLocale.f19021a, false, false, false));
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0120  */
    /* JADX WARN: Code duplicated, block: B:36:0x014d A[LOOP:0: B:34:0x0147->B:36:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0178  */
    /* JADX WARN: Code duplicated, block: B:42:0x018e A[LOOP:1: B:40:0x0188->B:42:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: W2 */
    public static final Serializable m8611W2(C1859b c1859b, ViewKeys viewKeys, String str, ContinuationImpl continuationImpl) throws Throwable {
        ReaderSettingsViewModel$buildTtsVoiceItems$1 readerSettingsViewModel$buildTtsVoiceItems$1;
        ViewKeys viewKeys2;
        String str2;
        int i;
        List list;
        List list2;
        List<LocalTextToSpeechVoice> list3;
        String str3;
        List list4;
        List list5;
        Object objM15541t;
        List list6;
        List list7;
        String str4;
        ViewKeys viewKeys3;
        List list8;
        boolean zBooleanValue;
        List list9;
        C1863b c1863b = c1859b.f22732n;
        if (continuationImpl instanceof ReaderSettingsViewModel$buildTtsVoiceItems$1) {
            readerSettingsViewModel$buildTtsVoiceItems$1 = (ReaderSettingsViewModel$buildTtsVoiceItems$1) continuationImpl;
            int i2 = readerSettingsViewModel$buildTtsVoiceItems$1.f22593j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readerSettingsViewModel$buildTtsVoiceItems$1.f22593j = i2 - Integer.MIN_VALUE;
            } else {
                readerSettingsViewModel$buildTtsVoiceItems$1 = new ReaderSettingsViewModel$buildTtsVoiceItems$1(c1859b, continuationImpl);
            }
        } else {
            readerSettingsViewModel$buildTtsVoiceItems$1 = new ReaderSettingsViewModel$buildTtsVoiceItems$1(c1859b, continuationImpl);
        }
        Object obj = readerSettingsViewModel$buildTtsVoiceItems$1.f22591h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = readerSettingsViewModel$buildTtsVoiceItems$1.f22593j;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            ListBuilder listBuilderM23650t = vz1.m23650t();
            viewKeys2 = viewKeys;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22584a = viewKeys2;
            str2 = str;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22585b = str2;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22586c = listBuilderM23650t;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22587d = listBuilderM23650t;
            i = 0;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22590g = 0;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22593j = 1;
            Object objMo8492m1 = ((sca) c1863b.f22922c).mo8492m1(readerSettingsViewModel$buildTtsVoiceItems$1);
            if (objMo8492m1 != coroutineSingletons) {
                list = listBuilderM23650t;
                obj = objMo8492m1;
                list2 = list;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = readerSettingsViewModel$buildTtsVoiceItems$1.f22590g;
            list2 = readerSettingsViewModel$buildTtsVoiceItems$1.f22587d;
            List list10 = readerSettingsViewModel$buildTtsVoiceItems$1.f22586c;
            String str5 = readerSettingsViewModel$buildTtsVoiceItems$1.f22585b;
            ViewKeys viewKeys4 = readerSettingsViewModel$buildTtsVoiceItems$1.f22584a;
            AbstractC3193b.m15359b(obj);
            i = i4;
            viewKeys2 = viewKeys4;
            list = list10;
            str2 = str5;
        } else {
            if (i3 == 2) {
                int i5 = readerSettingsViewModel$buildTtsVoiceItems$1.f22590g;
                List list11 = readerSettingsViewModel$buildTtsVoiceItems$1.f22588e;
                list2 = readerSettingsViewModel$buildTtsVoiceItems$1.f22587d;
                list4 = readerSettingsViewModel$buildTtsVoiceItems$1.f22586c;
                String str6 = readerSettingsViewModel$buildTtsVoiceItems$1.f22585b;
                ViewKeys viewKeys5 = readerSettingsViewModel$buildTtsVoiceItems$1.f22584a;
                AbstractC3193b.m15359b(obj);
                i = i5;
                list3 = list11;
                viewKeys2 = viewKeys5;
                str3 = str6;
                list5 = (List) obj;
                C1879a c1879a = c1859b.f22722d;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22584a = viewKeys2;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22585b = str3;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22586c = list4;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22587d = list2;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22588e = list3;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22589f = list5;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22590g = i;
                readerSettingsViewModel$buildTtsVoiceItems$1.f22593j = 3;
                objM15541t = AbstractC3224d.m15541t(((C1368a) c1879a.f23068a).f18371Q0, readerSettingsViewModel$buildTtsVoiceItems$1);
                if (objM15541t != coroutineSingletons) {
                    obj = objM15541t;
                    list6 = list5;
                    list7 = list2;
                    str4 = str3;
                    viewKeys3 = viewKeys2;
                    list8 = list4;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list6 = readerSettingsViewModel$buildTtsVoiceItems$1.f22589f;
            list3 = readerSettingsViewModel$buildTtsVoiceItems$1.f22588e;
            list7 = readerSettingsViewModel$buildTtsVoiceItems$1.f22587d;
            list8 = readerSettingsViewModel$buildTtsVoiceItems$1.f22586c;
            str4 = readerSettingsViewModel$buildTtsVoiceItems$1.f22585b;
            ViewKeys viewKeys6 = readerSettingsViewModel$buildTtsVoiceItems$1.f22584a;
            AbstractC3193b.m15359b(obj);
            viewKeys3 = viewKeys6;
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        list9 = list3;
        if (!list9.isEmpty()) {
            list7.add(new a39(R$string.settings_text_to_speech_web_voices));
            list7.add(new z29(R$string.settings_text_to_speech_use_web_voices, ViewKeys.UseWebVoices, zBooleanValue));
        }
        for (TextToSpeechVoice textToSpeechVoice : u91.m22614f1(list6, new yd7(2))) {
            String str7 = textToSpeechVoice.f19571b;
            list7.add(new y29(0, 16, viewKeys3, str7, str7, fa4.m11650l(str4, str7), textToSpeechVoice.m8125e(), textToSpeechVoice.f19578i.contains("premium")));
        }
        if (!list9.isEmpty()) {
            list7.add(new a39(R$string.settings_text_to_speech_local_voices));
            for (LocalTextToSpeechVoice localTextToSpeechVoice : list3) {
                String str8 = localTextToSpeechVoice.f19562b;
                list7.add(new y29(0, 112, viewKeys3, str8, localTextToSpeechVoice.f19561a, fa4.m11650l(str4, str8), false, false));
            }
        }
        return vz1.m23635i(list8);
        List list12 = (List) obj;
        String strMo4589b2 = c1859b.f22720b.mo4589b2();
        readerSettingsViewModel$buildTtsVoiceItems$1.f22584a = viewKeys2;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22585b = str2;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22586c = list;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22587d = list2;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22588e = list12;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22590g = i;
        readerSettingsViewModel$buildTtsVoiceItems$1.f22593j = 2;
        Object objM8618a = c1863b.m8618a(strMo4589b2, readerSettingsViewModel$buildTtsVoiceItems$1);
        if (objM8618a != coroutineSingletons) {
            list3 = list12;
            obj = objM8618a;
            List list13 = list;
            str3 = str2;
            list4 = list13;
            list5 = (List) obj;
            C1879a c1879a2 = c1859b.f22722d;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22584a = viewKeys2;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22585b = str3;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22586c = list4;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22587d = list2;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22588e = list3;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22589f = list5;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22590g = i;
            readerSettingsViewModel$buildTtsVoiceItems$1.f22593j = 3;
            objM15541t = AbstractC3224d.m15541t(((C1368a) c1879a2.f23068a).f18371Q0, readerSettingsViewModel$buildTtsVoiceItems$1);
            if (objM15541t != coroutineSingletons) {
                obj = objM15541t;
                list6 = list5;
                list7 = list2;
                str4 = str3;
                viewKeys3 = viewKeys2;
                list8 = list4;
                zBooleanValue = ((Boolean) obj).booleanValue();
                list9 = list3;
                if (!list9.isEmpty()) {
                    list7.add(new a39(R$string.settings_text_to_speech_web_voices));
                    list7.add(new z29(R$string.settings_text_to_speech_use_web_voices, ViewKeys.UseWebVoices, zBooleanValue));
                }
                while (r0.hasNext()) {
                    String str9 = textToSpeechVoice.f19571b;
                    list7.add(new y29(0, 16, viewKeys3, str9, str9, fa4.m11650l(str4, str9), textToSpeechVoice.m8125e(), textToSpeechVoice.f19578i.contains("premium")));
                }
                if (!list9.isEmpty()) {
                    list7.add(new a39(R$string.settings_text_to_speech_local_voices));
                    while (r0.hasNext()) {
                        String str10 = localTextToSpeechVoice.f19562b;
                        list7.add(new y29(0, 112, viewKeys3, str10, localTextToSpeechVoice.f19561a, fa4.m11650l(str4, str10), false, false));
                    }
                }
                return vz1.m23635i(list8);
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: X2 */
    public static void m8612X2(ListBuilder listBuilder, String str, boolean z) {
        if (fa4.m11650l(str, "Off")) {
            return;
        }
        listBuilder.add(new z19(R$string.transliteration_style_show_status, null, z, ViewKeys.TransliterationStatus, false));
    }

    /* JADX INFO: renamed from: Y2 */
    public static String m8613Y2(String str) {
        String strValueOf;
        String displayName = Locale.forLanguageTag(cl9.m4838U(str, '_', '-')).getDisplayName(Locale.getDefault());
        displayName.getClass();
        if (displayName.length() <= 0) {
            return displayName;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = displayName.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            strValueOf = ci8.m4711X(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(displayName.substring(1));
        return sb.toString();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22720b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22720b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22720b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22720b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22720b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22720b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22720b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22720b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22720b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22720b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22720b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f22721c.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22720b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22720b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22720b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22720b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22720b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22720b.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f22721c.mo3738Z();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m8614Z2(ViewKeys viewKeys, List list) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        C3244l c3244l = this.f22736r;
        c3244l.getClass();
        c3244l.m15572j(null, list);
        int i2 = tz7.f63147a[viewKeys.ordinal()];
        if (i2 == 1) {
            i = R$string.settings_text_to_speech;
        } else if (i2 != 2) {
            i = i2 != 3 ? R$string.settings_transliteration_style : com.lingq.core.p012ui.R$string.settings_audio_underline;
        } else {
            i = com.lingq.core.p012ui.R$string.settings_dictionary_languages;
        }
        Integer numValueOf = Integer.valueOf(i);
        C3244l c3244l2 = this.f22737s;
        c3244l2.getClass();
        c3244l2.m15572j(null, numValueOf);
        C3244l c3244l3 = this.f22735q;
        c3244l3.getClass();
        c3244l3.m15572j(null, viewKeys);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22720b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22720b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22720b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22720b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f22721c.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f22721c.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22720b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22720b.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f22721c.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22720b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f22721c.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22720b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22720b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22720b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22720b.mo4598w2();
    }
}
