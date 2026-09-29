package com.lingq.p055ui.token;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7374a;
import li.C7375b;
import li.C7378e;
import li.InterfaceC7379f;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p096ei.C5408a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$setupAsianScript$1", m19206f = "TokenViewModel.kt", m19207l = {447, 504, 512, 515, 523, 546, 569, 593}, m19208m = "invokeSuspend")
public final class TokenViewModel$setupAsianScript$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f31641e;

    /* JADX INFO: renamed from: f */
    public Ref$ObjectRef f31642f;

    /* JADX INFO: renamed from: g */
    public Ref$ObjectRef f31643g;

    /* JADX INFO: renamed from: h */
    public Ref$ObjectRef f31644h;

    /* JADX INFO: renamed from: i */
    public int f31645i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7379f f31646j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TokenViewModel f31647k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC4864a f31648l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$setupAsianScript$1(InterfaceC7379f interfaceC7379f, TokenViewModel tokenViewModel, AbstractC4864a abstractC4864a, InterfaceC9968c<? super TokenViewModel$setupAsianScript$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31646j = interfaceC7379f;
        this.f31647k = tokenViewModel;
        this.f31648l = abstractC4864a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$setupAsianScript$1(this.f31646j, this.f31647k, this.f31648l, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$setupAsianScript$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x0205  */
    /* JADX WARN: Code duplicated, block: B:119:0x0209  */
    /* JADX WARN: Code duplicated, block: B:121:0x0211  */
    /* JADX WARN: Code duplicated, block: B:122:0x0214  */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x0221  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:129:0x0227  */
    /* JADX WARN: Code duplicated, block: B:131:0x0231  */
    /* JADX WARN: Code duplicated, block: B:132:0x0234  */
    /* JADX WARN: Code duplicated, block: B:134:0x0238  */
    /* JADX WARN: Code duplicated, block: B:136:0x024c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x0288  */
    /* JADX WARN: Code duplicated, block: B:150:0x0296  */
    /* JADX WARN: Code duplicated, block: B:151:0x0299  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x0322  */
    /* JADX WARN: Code duplicated, block: B:173:0x0334  */
    /* JADX WARN: Code duplicated, block: B:175:0x034a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:176:0x034b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0359  */
    /* JADX WARN: Code duplicated, block: B:181:0x035e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0364  */
    /* JADX WARN: Code duplicated, block: B:188:0x0377  */
    /* JADX WARN: Code duplicated, block: B:191:0x0380  */
    /* JADX WARN: Code duplicated, block: B:192:0x038c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0392  */
    /* JADX WARN: Code duplicated, block: B:195:0x0394  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:205:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:209:0x03dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:210:0x03de  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:215:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:222:0x040a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0411  */
    /* JADX WARN: Code duplicated, block: B:226:0x041d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0423  */
    /* JADX WARN: Code duplicated, block: B:229:0x0425  */
    /* JADX WARN: Code duplicated, block: B:232:0x0433  */
    /* JADX WARN: Code duplicated, block: B:236:0x043d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0440  */
    /* JADX WARN: Code duplicated, block: B:239:0x044e  */
    /* JADX WARN: Code duplicated, block: B:241:0x045a  */
    /* JADX WARN: Code duplicated, block: B:243:0x0470 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:244:0x0471  */
    /* JADX WARN: Code duplicated, block: B:247:0x047f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0484  */
    /* JADX WARN: Code duplicated, block: B:252:0x048a  */
    /* JADX WARN: Code duplicated, block: B:256:0x049d  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:260:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:262:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:263:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:270:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:272:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:275:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:277:0x0509 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:278:0x050a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0517  */
    /* JADX WARN: Code duplicated, block: B:283:0x051c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0522  */
    /* JADX WARN: Code duplicated, block: B:290:0x0535  */
    /* JADX WARN: Code duplicated, block: B:293:0x053c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0548  */
    /* JADX WARN: Code duplicated, block: B:297:0x0551  */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:300:0x055f  */
    /* JADX WARN: Code duplicated, block: B:304:0x0569  */
    /* JADX WARN: Code duplicated, block: B:306:0x056c  */
    /* JADX WARN: Code duplicated, block: B:307:0x0579  */
    /* JADX WARN: Code duplicated, block: B:308:0x057b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0583  */
    /* JADX WARN: Code duplicated, block: B:312:0x058d  */
    /* JADX WARN: Code duplicated, block: B:313:0x058f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0592  */
    /* JADX WARN: Code duplicated, block: B:317:0x059a  */
    /* JADX WARN: Code duplicated, block: B:319:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:321:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:322:0x05af  */
    /* JADX WARN: Code duplicated, block: B:324:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:329:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:333:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [A, T] */
    /* JADX WARN: Type inference failed for: r2v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v112, types: [B, T] */
    /* JADX WARN: Type inference failed for: r6v13, types: [B, T] */
    /* JADX WARN: Type inference failed for: r9v25, types: [A, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Object objM10369m2;
        Ref$ObjectRef ref$ObjectRef5;
        String str2;
        Object objM10371o2;
        String str3;
        TokenData tokenData;
        TokenTransliteration tokenTransliteration;
        StateFlowImpl stateFlowImpl;
        TokenData tokenData2;
        TokenTransliteration tokenTransliteration2;
        boolean z10;
        boolean z11;
        Object objM10370n2;
        boolean z12;
        boolean z13;
        String strMo498E1;
        TokenData tokenData3;
        T t10;
        TokenTransliteration tokenTransliteration3;
        String str4;
        TokenData tokenData4;
        T t11;
        TokenTransliteration tokenTransliteration4;
        String str5;
        TokenData tokenData5;
        T t12;
        TokenTransliteration tokenTransliteration5;
        String str6;
        TokenData tokenData6;
        T t13;
        TokenTransliteration tokenTransliteration6;
        String str7;
        String strMo498E2;
        TokenData tokenData7;
        T t14;
        TokenTransliteration tokenTransliteration7;
        String str8;
        TokenData tokenData8;
        T t15;
        TokenTransliteration tokenTransliteration8;
        String str9;
        TokenData tokenData9;
        T t16;
        TokenTransliteration tokenTransliteration9;
        String str10;
        TokenData tokenData10;
        T t17;
        TokenTransliteration tokenTransliteration10;
        String str11;
        ArrayList arrayList;
        Object objM10368l2;
        Ref$ObjectRef ref$ObjectRef6;
        String str12;
        boolean z14;
        AbstractC4864a.b bVar;
        AbstractC4864a abstractC4864a;
        CharSequence charSequence;
        boolean z15;
        CharSequence charSequence2;
        boolean z16;
        String strMo498E3;
        boolean zM11106a;
        InterfaceC5179a interfaceC5179a;
        Object objM14360a;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        Object objM14360a2;
        Ref$ObjectRef ref$ObjectRef9;
        Ref$ObjectRef ref$ObjectRef10;
        String str13;
        Object objM14360a3;
        Ref$ObjectRef ref$ObjectRef11;
        Ref$ObjectRef ref$ObjectRef12;
        String str14;
        Object objM14360a4;
        Ref$ObjectRef ref$ObjectRef13;
        Ref$ObjectRef ref$ObjectRef14;
        String str15;
        ArrayList arrayList2;
        boolean z17;
        String str16;
        int iHashCode;
        String str17;
        boolean z18;
        String str18;
        int iHashCode2;
        String str19;
        boolean z19;
        String str20;
        int iHashCode3;
        String str21;
        boolean z20;
        String str22;
        int iHashCode4;
        String str23;
        boolean z21;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31645i;
        InterfaceC7379f interfaceC7379f = this.f31646j;
        TokenViewModel tokenViewModel = this.f31647k;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f38127a = "";
                ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.f38127a = "";
                if (interfaceC7379f instanceof C7378e ? true : interfaceC7379f instanceof C7374a) {
                    String strMo14774c = interfaceC7379f.mo14774c();
                    this.f31641e = "";
                    this.f31642f = ref$ObjectRef;
                    this.f31643g = ref$ObjectRef2;
                    this.f31645i = 1;
                    objM10371o2 = TokenViewModel.m10371o2(tokenViewModel, strMo14774c, this);
                    if (objM10371o2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = "";
                    ref$ObjectRef3 = ref$ObjectRef;
                    ref$ObjectRef4 = ref$ObjectRef2;
                    Pair pair = (Pair) objM10371o2;
                    ref$ObjectRef3.f38127a = pair.f38012a;
                    ref$ObjectRef4.f38127a = pair.f38013b;
                    tokenData = (TokenData) tokenViewModel.f31433V.getValue();
                    if (tokenData != null) {
                        tokenTransliteration = tokenData.f31184j;
                    } else {
                        tokenTransliteration = null;
                    }
                    stateFlowImpl = tokenViewModel.f31433V;
                    if (tokenTransliteration != null) {
                        if (((CharSequence) ref$ObjectRef3.f38127a).length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            strMo498E2 = tokenViewModel.mo498E1();
                            if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Mandarin))) {
                                tokenData10 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData10 != null || (tokenTransliteration10 = tokenData10.f31184j) == null || (str11 = tokenTransliteration10.f31394c) == null) {
                                    t17 = str11;
                                    t17 = "";
                                }
                                t17 = str11;
                                ref$ObjectRef3.f38127a = t17;
                            } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                                tokenData9 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData9 != null || (tokenTransliteration9 = tokenData9.f31184j) == null || (str10 = tokenTransliteration9.f31394c) == null) {
                                    t16 = str10;
                                    t16 = "";
                                }
                                t16 = str10;
                                ref$ObjectRef3.f38127a = t16;
                            } else if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Japanese))) {
                                tokenData8 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData8 != null || (tokenTransliteration8 = tokenData8.f31184j) == null || (str9 = tokenTransliteration8.f31393b) == null) {
                                    t15 = str9;
                                    t15 = "";
                                }
                                t15 = str9;
                                ref$ObjectRef3.f38127a = t15;
                            } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                                tokenData7 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData7 != null || (tokenTransliteration7 = tokenData7.f31184j) == null || (str8 = tokenTransliteration7.f31397f) == null) {
                                    t14 = str8;
                                    t14 = "";
                                }
                                t14 = str8;
                                ref$ObjectRef3.f38127a = t14;
                            }
                        }
                        if (((CharSequence) ref$ObjectRef4.f38127a).length() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            strMo498E1 = tokenViewModel.mo498E1();
                            if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Mandarin))) {
                                tokenData6 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData6 != null || (tokenTransliteration6 = tokenData6.f31184j) == null || (str7 = tokenTransliteration6.f31395d) == null) {
                                    t13 = str7;
                                    t13 = "";
                                }
                                t13 = str7;
                                ref$ObjectRef4.f38127a = t13;
                            } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                                tokenData5 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData5 != null || (tokenTransliteration5 = tokenData5.f31184j) == null || (str6 = tokenTransliteration5.f31396e) == null) {
                                    t12 = str6;
                                    t12 = "";
                                }
                                t12 = str6;
                                ref$ObjectRef4.f38127a = t12;
                            } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Japanese))) {
                                tokenData4 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData4 != null || (tokenTransliteration4 = tokenData4.f31184j) == null || (str5 = tokenTransliteration4.f31392a) == null) {
                                    t11 = str5;
                                    t11 = "";
                                }
                                t11 = str5;
                                ref$ObjectRef4.f38127a = t11;
                            } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                                tokenData3 = (TokenData) stateFlowImpl.getValue();
                                if (tokenData3 != null || (tokenTransliteration3 = tokenData3.f31184j) == null || (str4 = tokenTransliteration3.f31396e) == null) {
                                    t10 = str4;
                                    t10 = "";
                                }
                                t10 = str4;
                                ref$ObjectRef4.f38127a = t10;
                            }
                        }
                    } else {
                        tokenData2 = (TokenData) stateFlowImpl.getValue();
                        if (tokenData2 != null) {
                            tokenTransliteration2 = tokenData2.f31184j;
                        } else {
                            tokenTransliteration2 = null;
                        }
                        if (tokenTransliteration2 == null) {
                            if (((CharSequence) ref$ObjectRef3.f38127a).length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (((CharSequence) ref$ObjectRef4.f38127a).length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    String strMo14774c2 = interfaceC7379f.mo14774c();
                                    this.f31641e = str3;
                                    this.f31642f = ref$ObjectRef3;
                                    this.f31643g = ref$ObjectRef4;
                                    this.f31645i = 2;
                                    objM10370n2 = TokenViewModel.m10370n2(tokenViewModel, strMo14774c2, this);
                                    if (objM10370n2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    Pair pair2 = (Pair) objM10370n2;
                                    ref$ObjectRef3.f38127a = pair2.f38012a;
                                    ref$ObjectRef4.f38127a = pair2.f38013b;
                                }
                            }
                        }
                    }
                    str = str3;
                } else if (interfaceC7379f instanceof C7375b) {
                    List<String> list = ((C7375b) interfaceC7379f).f41164i;
                    this.f31641e = "";
                    this.f31642f = ref$ObjectRef;
                    this.f31643g = ref$ObjectRef2;
                    this.f31644h = ref$ObjectRef;
                    this.f31645i = 3;
                    objM10369m2 = TokenViewModel.m10369m2(tokenViewModel, list, this);
                    if (objM10369m2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef5 = ref$ObjectRef;
                    str2 = "";
                    arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) objM10369m2) {
                        if (((String) obj2).length() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            arrayList.add(obj2);
                        }
                    }
                    ref$ObjectRef.f38127a = C6752c.m13430X(arrayList, " &#8226; ", null, null, null, 62);
                    List<String> list2 = ((C7375b) interfaceC7379f).f41164i;
                    this.f31641e = str2;
                    this.f31642f = ref$ObjectRef5;
                    this.f31643g = ref$ObjectRef2;
                    this.f31644h = ref$ObjectRef2;
                    this.f31645i = 4;
                    objM10368l2 = TokenViewModel.m10368l2(tokenViewModel, list2, this);
                    if (objM10368l2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef6 = ref$ObjectRef2;
                    str12 = str2;
                    arrayList2 = new ArrayList();
                    for (Object obj3 : (Iterable) objM10368l2) {
                        if (((String) obj3).length() == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (!z17) {
                            arrayList2.add(obj3);
                        }
                    }
                    ref$ObjectRef2.f38127a = C6752c.m13430X(arrayList2, " &#8226; ", null, null, null, 62);
                    str = str12;
                    ref$ObjectRef4 = ref$ObjectRef6;
                    ref$ObjectRef3 = ref$ObjectRef5;
                } else {
                    str = "";
                    ref$ObjectRef3 = ref$ObjectRef;
                    ref$ObjectRef4 = ref$ObjectRef2;
                }
                bVar = AbstractC4864a.b.f31722a;
                abstractC4864a = this.f31648l;
                if (C5207g.m11106a(abstractC4864a, bVar)) {
                    strMo498E3 = tokenViewModel.mo498E1();
                    zM11106a = C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Mandarin));
                    interfaceC5179a = tokenViewModel.f31459l;
                    if (zM11106a) {
                        PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L = interfaceC5179a.mo9565L();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 5;
                        objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L, this);
                        if (objM14360a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef13 = ref$ObjectRef4;
                        ref$ObjectRef14 = ref$ObjectRef3;
                        str15 = str;
                        str16 = (String) objM14360a4;
                        iHashCode = str16.hashCode();
                        if (iHashCode != -1904268855) {
                            if (iHashCode != -469838457) {
                                if (iHashCode == 79183 && str16.equals("Off")) {
                                    str17 = (String) ref$ObjectRef14.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                    str = str17;
                                } else {
                                    str = str15;
                                }
                            } else if (str16.equals("Traditional")) {
                                str17 = (String) ref$ObjectRef13.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str17;
                            } else {
                                str = str15;
                            }
                        } else if (str16.equals("Pinyin")) {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        } else {
                            str = str15;
                        }
                        if (str != null || str.length() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            str = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d = interfaceC5179a.mo9586d();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 6;
                        objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d, this);
                        if (objM14360a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef11 = ref$ObjectRef4;
                        ref$ObjectRef12 = ref$ObjectRef3;
                        str14 = str;
                        str18 = (String) objM14360a3;
                        iHashCode2 = str18.hashCode();
                        if (iHashCode2 != -1904268855) {
                            if (iHashCode2 != 79183) {
                                if (iHashCode2 == 566114168 && str18.equals("Simplified")) {
                                    str19 = (String) ref$ObjectRef11.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str19;
                                } else {
                                    str = str14;
                                }
                            } else if (str18.equals("Off")) {
                                str19 = (String) ref$ObjectRef12.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str19;
                            } else {
                                str = str14;
                            }
                        } else if (str18.equals("Pinyin")) {
                            str19 = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str19;
                        } else {
                            str = str14;
                        }
                        if (str != null || str.length() == 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            str = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Japanese))) {
                        PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f0 = interfaceC5179a.mo9591f0();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 7;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f0, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef10 = ref$ObjectRef3;
                        str13 = str;
                        str20 = (String) objM14360a2;
                        iHashCode3 = str20.hashCode();
                        if (iHashCode3 != -1841522256) {
                            if (iHashCode3 != -1311598819) {
                                if (iHashCode3 == 79183 && str20.equals("Off")) {
                                    str21 = (String) ref$ObjectRef9.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str21;
                                } else {
                                    str = str13;
                                }
                            } else if (str20.equals("Hiragana")) {
                                str21 = (String) ref$ObjectRef9.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str21;
                            } else {
                                str = str13;
                            }
                        } else if (str20.equals("Romaji")) {
                            str21 = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str21;
                        } else {
                            str = str13;
                        }
                        if (str != null || str.length() == 0) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (z20) {
                            str = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                        PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B = interfaceC5179a.mo9555B();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 8;
                        objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef7 = ref$ObjectRef4;
                        ref$ObjectRef8 = ref$ObjectRef3;
                        str22 = (String) objM14360a;
                        iHashCode4 = str22.hashCode();
                        if (iHashCode4 == -702078272) {
                            if (iHashCode4 == 79183) {
                                if (iHashCode4 == 566114168 && str22.equals("Simplified")) {
                                    str23 = (String) ref$ObjectRef7.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str23;
                                }
                            } else if (!str22.equals("Off")) {
                                str23 = (String) ref$ObjectRef8.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str23;
                            }
                        } else if (!str22.equals("Jyutping")) {
                            str23 = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str23;
                        }
                        if (str != null || str.length() == 0) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            str = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else {
                        str = "";
                    }
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.c.f31723a)) {
                    charSequence2 = (CharSequence) ref$ObjectRef3.f38127a;
                    if (charSequence2.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        charSequence2 = (String) ref$ObjectRef4.f38127a;
                    }
                    str = (String) charSequence2;
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.a.f31721a)) {
                    charSequence = (CharSequence) ref$ObjectRef4.f38127a;
                    if (charSequence.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        charSequence = (String) ref$ObjectRef3.f38127a;
                    }
                    str = (String) charSequence;
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 1:
                ref$ObjectRef4 = this.f31643g;
                ref$ObjectRef3 = this.f31642f;
                String str24 = this.f31641e;
                C7499b.m14977z0(obj);
                str3 = str24;
                objM10371o2 = obj;
                Pair pair3 = (Pair) objM10371o2;
                ref$ObjectRef3.f38127a = pair3.f38012a;
                ref$ObjectRef4.f38127a = pair3.f38013b;
                tokenData = (TokenData) tokenViewModel.f31433V.getValue();
                if (tokenData != null) {
                    tokenTransliteration = tokenData.f31184j;
                } else {
                    tokenTransliteration = null;
                }
                stateFlowImpl = tokenViewModel.f31433V;
                if (tokenTransliteration != null) {
                    if (((CharSequence) ref$ObjectRef3.f38127a).length() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        strMo498E2 = tokenViewModel.mo498E1();
                        if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Mandarin))) {
                            tokenData10 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData10 != null) {
                                t17 = str11;
                                t17 = "";
                            } else {
                                t17 = str11;
                                t17 = "";
                            }
                            t17 = str11;
                            ref$ObjectRef3.f38127a = t17;
                        } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                            tokenData9 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData9 != null) {
                                t16 = str10;
                                t16 = "";
                            } else {
                                t16 = str10;
                                t16 = "";
                            }
                            t16 = str10;
                            ref$ObjectRef3.f38127a = t16;
                        } else if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Japanese))) {
                            tokenData8 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData8 != null) {
                                t15 = str9;
                                t15 = "";
                            } else {
                                t15 = str9;
                                t15 = "";
                            }
                            t15 = str9;
                            ref$ObjectRef3.f38127a = t15;
                        } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                            tokenData7 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData7 != null) {
                                t14 = str8;
                                t14 = "";
                            } else {
                                t14 = str8;
                                t14 = "";
                            }
                            t14 = str8;
                            ref$ObjectRef3.f38127a = t14;
                        }
                    }
                    if (((CharSequence) ref$ObjectRef4.f38127a).length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        strMo498E1 = tokenViewModel.mo498E1();
                        if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Mandarin))) {
                            tokenData6 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData6 != null) {
                                t13 = str7;
                                t13 = "";
                            } else {
                                t13 = str7;
                                t13 = "";
                            }
                            t13 = str7;
                            ref$ObjectRef4.f38127a = t13;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                            tokenData5 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData5 != null) {
                                t12 = str6;
                                t12 = "";
                            } else {
                                t12 = str6;
                                t12 = "";
                            }
                            t12 = str6;
                            ref$ObjectRef4.f38127a = t12;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Japanese))) {
                            tokenData4 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData4 != null) {
                                t11 = str5;
                                t11 = "";
                            } else {
                                t11 = str5;
                                t11 = "";
                            }
                            t11 = str5;
                            ref$ObjectRef4.f38127a = t11;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                            tokenData3 = (TokenData) stateFlowImpl.getValue();
                            if (tokenData3 != null) {
                                t10 = str4;
                                t10 = "";
                            } else {
                                t10 = str4;
                                t10 = "";
                            }
                            t10 = str4;
                            ref$ObjectRef4.f38127a = t10;
                        }
                    }
                } else {
                    tokenData2 = (TokenData) stateFlowImpl.getValue();
                    if (tokenData2 != null) {
                        tokenTransliteration2 = tokenData2.f31184j;
                    } else {
                        tokenTransliteration2 = null;
                    }
                    if (tokenTransliteration2 == null) {
                        if (((CharSequence) ref$ObjectRef3.f38127a).length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (((CharSequence) ref$ObjectRef4.f38127a).length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                String strMo14774c3 = interfaceC7379f.mo14774c();
                                this.f31641e = str3;
                                this.f31642f = ref$ObjectRef3;
                                this.f31643g = ref$ObjectRef4;
                                this.f31645i = 2;
                                objM10370n2 = TokenViewModel.m10370n2(tokenViewModel, strMo14774c3, this);
                                if (objM10370n2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                Pair pair4 = (Pair) objM10370n2;
                                ref$ObjectRef3.f38127a = pair4.f38012a;
                                ref$ObjectRef4.f38127a = pair4.f38013b;
                            }
                        }
                    }
                }
                str = str3;
                bVar = AbstractC4864a.b.f31722a;
                abstractC4864a = this.f31648l;
                if (C5207g.m11106a(abstractC4864a, bVar)) {
                    strMo498E3 = tokenViewModel.mo498E1();
                    zM11106a = C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Mandarin));
                    interfaceC5179a = tokenViewModel.f31459l;
                    if (zM11106a) {
                        PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L2 = interfaceC5179a.mo9565L();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 5;
                        objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L2, this);
                        if (objM14360a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef13 = ref$ObjectRef4;
                        ref$ObjectRef14 = ref$ObjectRef3;
                        str15 = str;
                        str16 = (String) objM14360a4;
                        iHashCode = str16.hashCode();
                        if (iHashCode != -1904268855) {
                            if (iHashCode != -469838457) {
                                if (iHashCode == 79183) {
                                    str17 = (String) ref$ObjectRef14.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                    str = str17;
                                }
                                str = str15;
                            } else if (str16.equals("Traditional")) {
                                str = str15;
                            } else {
                                str17 = (String) ref$ObjectRef13.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str17;
                            }
                        } else if (str16.equals("Pinyin")) {
                            str = str15;
                        } else {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        }
                        if (str != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            str = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d2 = interfaceC5179a.mo9586d();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 6;
                        objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d2, this);
                        if (objM14360a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef11 = ref$ObjectRef4;
                        ref$ObjectRef12 = ref$ObjectRef3;
                        str14 = str;
                        str18 = (String) objM14360a3;
                        iHashCode2 = str18.hashCode();
                        if (iHashCode2 != -1904268855) {
                            if (iHashCode2 != 79183) {
                                if (iHashCode2 == 566114168) {
                                    str19 = (String) ref$ObjectRef11.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str19;
                                }
                                str = str14;
                            } else if (str18.equals("Off")) {
                                str = str14;
                            } else {
                                str19 = (String) ref$ObjectRef12.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str19;
                            }
                        } else if (str18.equals("Pinyin")) {
                            str = str14;
                        } else {
                            str19 = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str19;
                        }
                        if (str != null) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            str = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Japanese))) {
                        PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f1 = interfaceC5179a.mo9591f0();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 7;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f1, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef10 = ref$ObjectRef3;
                        str13 = str;
                        str20 = (String) objM14360a2;
                        iHashCode3 = str20.hashCode();
                        if (iHashCode3 != -1841522256) {
                            if (iHashCode3 != -1311598819) {
                                if (iHashCode3 == 79183) {
                                    str21 = (String) ref$ObjectRef9.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str21;
                                }
                                str = str13;
                            } else if (str20.equals("Hiragana")) {
                                str = str13;
                            } else {
                                str21 = (String) ref$ObjectRef9.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str21;
                            }
                        } else if (str20.equals("Romaji")) {
                            str = str13;
                        } else {
                            str21 = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str21;
                        }
                        if (str != null) {
                            z20 = true;
                        } else {
                            z20 = true;
                        }
                        if (z20) {
                            str = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                        PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B2 = interfaceC5179a.mo9555B();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 8;
                        objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B2, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef7 = ref$ObjectRef4;
                        ref$ObjectRef8 = ref$ObjectRef3;
                        str22 = (String) objM14360a;
                        iHashCode4 = str22.hashCode();
                        if (iHashCode4 == -702078272) {
                            if (iHashCode4 == 79183) {
                                if (iHashCode4 == 566114168) {
                                    str23 = (String) ref$ObjectRef7.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str23;
                                }
                            } else if (!str22.equals("Off")) {
                                str23 = (String) ref$ObjectRef8.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str23;
                            }
                        } else if (!str22.equals("Jyutping")) {
                            str23 = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str23;
                        }
                        if (str != null) {
                            z21 = true;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            str = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else {
                        str = "";
                    }
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.c.f31723a)) {
                    charSequence2 = (CharSequence) ref$ObjectRef3.f38127a;
                    if (charSequence2.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        charSequence2 = (String) ref$ObjectRef4.f38127a;
                    }
                    str = (String) charSequence2;
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.a.f31721a)) {
                    charSequence = (CharSequence) ref$ObjectRef4.f38127a;
                    if (charSequence.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        charSequence = (String) ref$ObjectRef3.f38127a;
                    }
                    str = (String) charSequence;
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 2:
                ref$ObjectRef4 = this.f31643g;
                ref$ObjectRef3 = this.f31642f;
                String str25 = this.f31641e;
                C7499b.m14977z0(obj);
                str3 = str25;
                objM10370n2 = obj;
                Pair pair5 = (Pair) objM10370n2;
                ref$ObjectRef3.f38127a = pair5.f38012a;
                ref$ObjectRef4.f38127a = pair5.f38013b;
                str = str3;
                bVar = AbstractC4864a.b.f31722a;
                abstractC4864a = this.f31648l;
                if (C5207g.m11106a(abstractC4864a, bVar)) {
                    strMo498E3 = tokenViewModel.mo498E1();
                    zM11106a = C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Mandarin));
                    interfaceC5179a = tokenViewModel.f31459l;
                    if (zM11106a) {
                        PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L3 = interfaceC5179a.mo9565L();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 5;
                        objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L3, this);
                        if (objM14360a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef13 = ref$ObjectRef4;
                        ref$ObjectRef14 = ref$ObjectRef3;
                        str15 = str;
                        str16 = (String) objM14360a4;
                        iHashCode = str16.hashCode();
                        if (iHashCode != -1904268855) {
                            if (iHashCode != -469838457) {
                                if (iHashCode == 79183) {
                                    str17 = (String) ref$ObjectRef14.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                    str = str17;
                                }
                                str = str15;
                            } else if (str16.equals("Traditional")) {
                                str = str15;
                            } else {
                                str17 = (String) ref$ObjectRef13.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str17;
                            }
                        } else if (str16.equals("Pinyin")) {
                            str = str15;
                        } else {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        }
                        if (str != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            str = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d3 = interfaceC5179a.mo9586d();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 6;
                        objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d3, this);
                        if (objM14360a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef11 = ref$ObjectRef4;
                        ref$ObjectRef12 = ref$ObjectRef3;
                        str14 = str;
                        str18 = (String) objM14360a3;
                        iHashCode2 = str18.hashCode();
                        if (iHashCode2 != -1904268855) {
                            if (iHashCode2 != 79183) {
                                if (iHashCode2 == 566114168) {
                                    str19 = (String) ref$ObjectRef11.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str19;
                                }
                                str = str14;
                            } else if (str18.equals("Off")) {
                                str = str14;
                            } else {
                                str19 = (String) ref$ObjectRef12.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str19;
                            }
                        } else if (str18.equals("Pinyin")) {
                            str = str14;
                        } else {
                            str19 = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str19;
                        }
                        if (str != null) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            str = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Japanese))) {
                        PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f2 = interfaceC5179a.mo9591f0();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 7;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f2, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef10 = ref$ObjectRef3;
                        str13 = str;
                        str20 = (String) objM14360a2;
                        iHashCode3 = str20.hashCode();
                        if (iHashCode3 != -1841522256) {
                            if (iHashCode3 != -1311598819) {
                                if (iHashCode3 == 79183) {
                                    str21 = (String) ref$ObjectRef9.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str21;
                                }
                                str = str13;
                            } else if (str20.equals("Hiragana")) {
                                str = str13;
                            } else {
                                str21 = (String) ref$ObjectRef9.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str21;
                            }
                        } else if (str20.equals("Romaji")) {
                            str = str13;
                        } else {
                            str21 = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str21;
                        }
                        if (str != null) {
                            z20 = true;
                        } else {
                            z20 = true;
                        }
                        if (z20) {
                            str = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                        PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B3 = interfaceC5179a.mo9555B();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 8;
                        objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B3, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef7 = ref$ObjectRef4;
                        ref$ObjectRef8 = ref$ObjectRef3;
                        str22 = (String) objM14360a;
                        iHashCode4 = str22.hashCode();
                        if (iHashCode4 == -702078272) {
                            if (iHashCode4 == 79183) {
                                if (iHashCode4 == 566114168) {
                                    str23 = (String) ref$ObjectRef7.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str23;
                                }
                            } else if (!str22.equals("Off")) {
                                str23 = (String) ref$ObjectRef8.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str23;
                            }
                        } else if (!str22.equals("Jyutping")) {
                            str23 = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str23;
                        }
                        if (str != null) {
                            z21 = true;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            str = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else {
                        str = "";
                    }
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.c.f31723a)) {
                    charSequence2 = (CharSequence) ref$ObjectRef3.f38127a;
                    if (charSequence2.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        charSequence2 = (String) ref$ObjectRef4.f38127a;
                    }
                    str = (String) charSequence2;
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.a.f31721a)) {
                    charSequence = (CharSequence) ref$ObjectRef4.f38127a;
                    if (charSequence.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        charSequence = (String) ref$ObjectRef3.f38127a;
                    }
                    str = (String) charSequence;
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 3:
                ref$ObjectRef = this.f31644h;
                Ref$ObjectRef ref$ObjectRef15 = this.f31643g;
                ref$ObjectRef5 = this.f31642f;
                String str26 = this.f31641e;
                C7499b.m14977z0(obj);
                str2 = str26;
                ref$ObjectRef2 = ref$ObjectRef15;
                objM10369m2 = obj;
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                    if (((String) obj2).length() == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        arrayList.add(obj2);
                    }
                }
                ref$ObjectRef.f38127a = C6752c.m13430X(arrayList, " &#8226; ", null, null, null, 62);
                List<String> list3 = ((C7375b) interfaceC7379f).f41164i;
                this.f31641e = str2;
                this.f31642f = ref$ObjectRef5;
                this.f31643g = ref$ObjectRef2;
                this.f31644h = ref$ObjectRef2;
                this.f31645i = 4;
                objM10368l2 = TokenViewModel.m10368l2(tokenViewModel, list3, this);
                if (objM10368l2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef6 = ref$ObjectRef2;
                str12 = str2;
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    if (((String) obj3).length() == 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList2.add(obj3);
                    }
                }
                ref$ObjectRef2.f38127a = C6752c.m13430X(arrayList2, " &#8226; ", null, null, null, 62);
                str = str12;
                ref$ObjectRef4 = ref$ObjectRef6;
                ref$ObjectRef3 = ref$ObjectRef5;
                bVar = AbstractC4864a.b.f31722a;
                abstractC4864a = this.f31648l;
                if (C5207g.m11106a(abstractC4864a, bVar)) {
                    strMo498E3 = tokenViewModel.mo498E1();
                    zM11106a = C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Mandarin));
                    interfaceC5179a = tokenViewModel.f31459l;
                    if (zM11106a) {
                        PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L4 = interfaceC5179a.mo9565L();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 5;
                        objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L4, this);
                        if (objM14360a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef13 = ref$ObjectRef4;
                        ref$ObjectRef14 = ref$ObjectRef3;
                        str15 = str;
                        str16 = (String) objM14360a4;
                        iHashCode = str16.hashCode();
                        if (iHashCode != -1904268855) {
                            if (iHashCode != -469838457) {
                                if (iHashCode == 79183) {
                                    str17 = (String) ref$ObjectRef14.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                    str = str17;
                                }
                                str = str15;
                            } else if (str16.equals("Traditional")) {
                                str = str15;
                            } else {
                                str17 = (String) ref$ObjectRef13.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str17;
                            }
                        } else if (str16.equals("Pinyin")) {
                            str = str15;
                        } else {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        }
                        if (str != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            str = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d4 = interfaceC5179a.mo9586d();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 6;
                        objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d4, this);
                        if (objM14360a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef11 = ref$ObjectRef4;
                        ref$ObjectRef12 = ref$ObjectRef3;
                        str14 = str;
                        str18 = (String) objM14360a3;
                        iHashCode2 = str18.hashCode();
                        if (iHashCode2 != -1904268855) {
                            if (iHashCode2 != 79183) {
                                if (iHashCode2 == 566114168) {
                                    str19 = (String) ref$ObjectRef11.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str19;
                                }
                                str = str14;
                            } else if (str18.equals("Off")) {
                                str = str14;
                            } else {
                                str19 = (String) ref$ObjectRef12.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str19;
                            }
                        } else if (str18.equals("Pinyin")) {
                            str = str14;
                        } else {
                            str19 = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str19;
                        }
                        if (str != null) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            str = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Japanese))) {
                        PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f3 = interfaceC5179a.mo9591f0();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 7;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f3, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef10 = ref$ObjectRef3;
                        str13 = str;
                        str20 = (String) objM14360a2;
                        iHashCode3 = str20.hashCode();
                        if (iHashCode3 != -1841522256) {
                            if (iHashCode3 != -1311598819) {
                                if (iHashCode3 == 79183) {
                                    str21 = (String) ref$ObjectRef9.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str21;
                                }
                                str = str13;
                            } else if (str20.equals("Hiragana")) {
                                str = str13;
                            } else {
                                str21 = (String) ref$ObjectRef9.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str21;
                            }
                        } else if (str20.equals("Romaji")) {
                            str = str13;
                        } else {
                            str21 = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str21;
                        }
                        if (str != null) {
                            z20 = true;
                        } else {
                            z20 = true;
                        }
                        if (z20) {
                            str = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                        PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B4 = interfaceC5179a.mo9555B();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 8;
                        objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B4, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef7 = ref$ObjectRef4;
                        ref$ObjectRef8 = ref$ObjectRef3;
                        str22 = (String) objM14360a;
                        iHashCode4 = str22.hashCode();
                        if (iHashCode4 == -702078272) {
                            if (iHashCode4 == 79183) {
                                if (iHashCode4 == 566114168) {
                                    str23 = (String) ref$ObjectRef7.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str23;
                                }
                            } else if (!str22.equals("Off")) {
                                str23 = (String) ref$ObjectRef8.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str23;
                            }
                        } else if (!str22.equals("Jyutping")) {
                            str23 = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str23;
                        }
                        if (str != null) {
                            z21 = true;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            str = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else {
                        str = "";
                    }
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.c.f31723a)) {
                    charSequence2 = (CharSequence) ref$ObjectRef3.f38127a;
                    if (charSequence2.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        charSequence2 = (String) ref$ObjectRef4.f38127a;
                    }
                    str = (String) charSequence2;
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.a.f31721a)) {
                    charSequence = (CharSequence) ref$ObjectRef4.f38127a;
                    if (charSequence.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        charSequence = (String) ref$ObjectRef3.f38127a;
                    }
                    str = (String) charSequence;
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 4:
                Ref$ObjectRef ref$ObjectRef16 = this.f31644h;
                ref$ObjectRef6 = this.f31643g;
                ref$ObjectRef5 = this.f31642f;
                str12 = this.f31641e;
                C7499b.m14977z0(obj);
                ref$ObjectRef2 = ref$ObjectRef16;
                objM10368l2 = obj;
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    if (((String) obj3).length() == 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList2.add(obj3);
                    }
                }
                ref$ObjectRef2.f38127a = C6752c.m13430X(arrayList2, " &#8226; ", null, null, null, 62);
                str = str12;
                ref$ObjectRef4 = ref$ObjectRef6;
                ref$ObjectRef3 = ref$ObjectRef5;
                bVar = AbstractC4864a.b.f31722a;
                abstractC4864a = this.f31648l;
                if (C5207g.m11106a(abstractC4864a, bVar)) {
                    strMo498E3 = tokenViewModel.mo498E1();
                    zM11106a = C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Mandarin));
                    interfaceC5179a = tokenViewModel.f31459l;
                    if (zM11106a) {
                        PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L5 = interfaceC5179a.mo9565L();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 5;
                        objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L5, this);
                        if (objM14360a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef13 = ref$ObjectRef4;
                        ref$ObjectRef14 = ref$ObjectRef3;
                        str15 = str;
                        str16 = (String) objM14360a4;
                        iHashCode = str16.hashCode();
                        if (iHashCode != -1904268855) {
                            if (iHashCode != -469838457) {
                                if (iHashCode == 79183) {
                                    str17 = (String) ref$ObjectRef14.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                    str = str17;
                                }
                                str = str15;
                            } else if (str16.equals("Traditional")) {
                                str = str15;
                            } else {
                                str17 = (String) ref$ObjectRef13.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str17;
                            }
                        } else if (str16.equals("Pinyin")) {
                            str = str15;
                        } else {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        }
                        if (str != null) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            str = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d5 = interfaceC5179a.mo9586d();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 6;
                        objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d5, this);
                        if (objM14360a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef11 = ref$ObjectRef4;
                        ref$ObjectRef12 = ref$ObjectRef3;
                        str14 = str;
                        str18 = (String) objM14360a3;
                        iHashCode2 = str18.hashCode();
                        if (iHashCode2 != -1904268855) {
                            if (iHashCode2 != 79183) {
                                if (iHashCode2 == 566114168) {
                                    str19 = (String) ref$ObjectRef11.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str19;
                                }
                                str = str14;
                            } else if (str18.equals("Off")) {
                                str = str14;
                            } else {
                                str19 = (String) ref$ObjectRef12.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str19;
                            }
                        } else if (str18.equals("Pinyin")) {
                            str = str14;
                        } else {
                            str19 = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str19;
                        }
                        if (str != null) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            str = (String) ref$ObjectRef12.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11569b(LanguageLearn.Japanese))) {
                        PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f4 = interfaceC5179a.mo9591f0();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 7;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f4, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef10 = ref$ObjectRef3;
                        str13 = str;
                        str20 = (String) objM14360a2;
                        iHashCode3 = str20.hashCode();
                        if (iHashCode3 != -1841522256) {
                            if (iHashCode3 != -1311598819) {
                                if (iHashCode3 == 79183) {
                                    str21 = (String) ref$ObjectRef9.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str21;
                                }
                                str = str13;
                            } else if (str20.equals("Hiragana")) {
                                str = str13;
                            } else {
                                str21 = (String) ref$ObjectRef9.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                str = str21;
                            }
                        } else if (str20.equals("Romaji")) {
                            str = str13;
                        } else {
                            str21 = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str21;
                        }
                        if (str != null) {
                            z20 = true;
                        } else {
                            z20 = true;
                        }
                        if (z20) {
                            str = (String) ref$ObjectRef10.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else if (C5207g.m11106a(strMo498E3, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                        PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B5 = interfaceC5179a.mo9555B();
                        this.f31641e = str;
                        this.f31642f = ref$ObjectRef3;
                        this.f31643g = ref$ObjectRef4;
                        this.f31644h = null;
                        this.f31645i = 8;
                        objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B5, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef7 = ref$ObjectRef4;
                        ref$ObjectRef8 = ref$ObjectRef3;
                        str22 = (String) objM14360a;
                        iHashCode4 = str22.hashCode();
                        if (iHashCode4 == -702078272) {
                            if (iHashCode4 == 79183) {
                                if (iHashCode4 == 566114168) {
                                    str23 = (String) ref$ObjectRef7.f38127a;
                                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                                    str = str23;
                                }
                            } else if (!str22.equals("Off")) {
                                str23 = (String) ref$ObjectRef8.f38127a;
                                tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                                str = str23;
                            }
                        } else if (!str22.equals("Jyutping")) {
                            str23 = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str23;
                        }
                        if (str != null) {
                            z21 = true;
                        } else {
                            z21 = true;
                        }
                        if (z21) {
                            str = (String) ref$ObjectRef8.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        }
                    } else {
                        str = "";
                    }
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.c.f31723a)) {
                    charSequence2 = (CharSequence) ref$ObjectRef3.f38127a;
                    if (charSequence2.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        charSequence2 = (String) ref$ObjectRef4.f38127a;
                    }
                    str = (String) charSequence2;
                } else if (C5207g.m11106a(abstractC4864a, AbstractC4864a.a.f31721a)) {
                    charSequence = (CharSequence) ref$ObjectRef4.f38127a;
                    if (charSequence.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        charSequence = (String) ref$ObjectRef3.f38127a;
                    }
                    str = (String) charSequence;
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 5:
                ref$ObjectRef13 = this.f31643g;
                ref$ObjectRef14 = this.f31642f;
                str15 = this.f31641e;
                C7499b.m14977z0(obj);
                objM14360a4 = obj;
                str16 = (String) objM14360a4;
                iHashCode = str16.hashCode();
                if (iHashCode != -1904268855) {
                    if (iHashCode != -469838457) {
                        if (iHashCode == 79183) {
                            str17 = (String) ref$ObjectRef14.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                            str = str17;
                        }
                        str = str15;
                    } else if (str16.equals("Traditional")) {
                        str = str15;
                    } else {
                        str17 = (String) ref$ObjectRef13.f38127a;
                        tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                        str = str17;
                    }
                } else if (str16.equals("Pinyin")) {
                    str = str15;
                } else {
                    str17 = (String) ref$ObjectRef14.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                    str = str17;
                }
                if (str != null) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (z18) {
                    str = (String) ref$ObjectRef14.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ref$ObjectRef11 = this.f31643g;
                ref$ObjectRef12 = this.f31642f;
                str14 = this.f31641e;
                C7499b.m14977z0(obj);
                objM14360a3 = obj;
                str18 = (String) objM14360a3;
                iHashCode2 = str18.hashCode();
                if (iHashCode2 != -1904268855) {
                    if (iHashCode2 != 79183) {
                        if (iHashCode2 == 566114168) {
                            str19 = (String) ref$ObjectRef11.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                            str = str19;
                        }
                        str = str14;
                    } else if (str18.equals("Off")) {
                        str = str14;
                    } else {
                        str19 = (String) ref$ObjectRef12.f38127a;
                        tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        str = str19;
                    }
                } else if (str18.equals("Pinyin")) {
                    str = str14;
                } else {
                    str19 = (String) ref$ObjectRef12.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                    str = str19;
                }
                if (str != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    str = (String) ref$ObjectRef12.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ref$ObjectRef9 = this.f31643g;
                ref$ObjectRef10 = this.f31642f;
                str13 = this.f31641e;
                C7499b.m14977z0(obj);
                objM14360a2 = obj;
                str20 = (String) objM14360a2;
                iHashCode3 = str20.hashCode();
                if (iHashCode3 != -1841522256) {
                    if (iHashCode3 != -1311598819) {
                        if (iHashCode3 == 79183) {
                            str21 = (String) ref$ObjectRef9.f38127a;
                            tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                            str = str21;
                        }
                        str = str13;
                    } else if (str20.equals("Hiragana")) {
                        str = str13;
                    } else {
                        str21 = (String) ref$ObjectRef9.f38127a;
                        tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                        str = str21;
                    }
                } else if (str20.equals("Romaji")) {
                    str = str13;
                } else {
                    str21 = (String) ref$ObjectRef10.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                    str = str21;
                }
                if (str != null) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                if (z20) {
                    str = (String) ref$ObjectRef10.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            case 8:
                ref$ObjectRef7 = this.f31643g;
                ref$ObjectRef8 = this.f31642f;
                str = this.f31641e;
                C7499b.m14977z0(obj);
                objM14360a = obj;
                str22 = (String) objM14360a;
                iHashCode4 = str22.hashCode();
                if (iHashCode4 == -702078272) {
                    if (!str22.equals("Jyutping")) {
                        str23 = (String) ref$ObjectRef8.f38127a;
                        tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        str = str23;
                    }
                    tokenViewModel.f31438Y.setValue(str != null ? str : "");
                    return C9072e.f47360a;
                }
                if (iHashCode4 == 79183) {
                    if (!str22.equals("Off")) {
                        str23 = (String) ref$ObjectRef8.f38127a;
                        tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                        str = str23;
                    }
                    tokenViewModel.f31438Y.setValue(str != null ? str : "");
                    return C9072e.f47360a;
                }
                if (iHashCode4 == 566114168) {
                    str23 = (String) ref$ObjectRef7.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.a.f31721a);
                    str = str23;
                }
                if (str != null) {
                    z21 = true;
                } else {
                    z21 = true;
                }
                if (z21) {
                    str = (String) ref$ObjectRef8.f38127a;
                    tokenViewModel.f31418N0.setValue(AbstractC4864a.c.f31723a);
                }
                tokenViewModel.f31438Y.setValue(str != null ? str : "");
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
