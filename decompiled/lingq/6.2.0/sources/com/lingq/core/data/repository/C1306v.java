package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.HintUpdateWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.entity.TranslationsEntity;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.network.api.requests.RequestHintUpdate;
import com.lingq.core.network.api.requests.RequestTranslate;
import com.lingq.core.network.api.result.ResultMeaning;
import com.lingq.core.network.api.result.ResultRelatedPhrase;
import com.lingq.core.network.api.result.ResultTokenCwt;
import com.lingq.core.network.api.result.ResultTranslationGoogle;
import com.lingq.core.network.api.result.ResultTranslationSimple;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.ak1;
import p000.b5a;
import p000.c83;
import p000.df4;
import p000.f4a;
import p000.gk6;
import p000.hi8;
import p000.kuc;
import p000.n3a;
import p000.o3a;
import p000.o7b;
import p000.p3a;
import p000.psc;
import p000.q3a;
import p000.ql4;
import p000.r3a;
import p000.sx7;
import p000.tx6;
import p000.u91;
import p000.ux5;
import p000.ux6;
import p000.v3a;
import p000.v91;
import p000.vz1;
import p000.w3a;
import p000.x3a;
import p000.xfa;
import p000.xtc;

/* JADX INFO: renamed from: com.lingq.core.data.repository.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C1306v implements w3a {

    /* JADX INFO: renamed from: a */
    public final v3a f16559a;

    /* JADX INFO: renamed from: b */
    public final x3a f16560b;

    /* JADX INFO: renamed from: c */
    public final df4 f16561c;

    /* JADX INFO: renamed from: d */
    public final C0773b f16562d;

    public C1306v(LingQDatabase lingQDatabase, v3a v3aVar, x3a x3aVar, o7b o7bVar, df4 df4Var, C0773b c0773b) {
        lingQDatabase.getClass();
        v3aVar.getClass();
        x3aVar.getClass();
        o7bVar.getClass();
        df4Var.getClass();
        c0773b.getClass();
        this.f16559a = v3aVar;
        this.f16560b = x3aVar;
        this.f16561c = df4Var;
        this.f16562d = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m7377c(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$fetchPopularMeanings$1 tokenDataRepositoryImpl$fetchPopularMeanings$1;
        String str4;
        String str5;
        String str6;
        List list;
        if (continuationImpl instanceof TokenDataRepositoryImpl$fetchPopularMeanings$1) {
            tokenDataRepositoryImpl$fetchPopularMeanings$1 = (TokenDataRepositoryImpl$fetchPopularMeanings$1) continuationImpl;
            int i = tokenDataRepositoryImpl$fetchPopularMeanings$1.f16158g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$fetchPopularMeanings$1.f16158g = i - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$fetchPopularMeanings$1 = new TokenDataRepositoryImpl$fetchPopularMeanings$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$fetchPopularMeanings$1 = new TokenDataRepositoryImpl$fetchPopularMeanings$1(this, continuationImpl);
        }
        TokenDataRepositoryImpl$fetchPopularMeanings$1 tokenDataRepositoryImpl$fetchPopularMeanings$2 = tokenDataRepositoryImpl$fetchPopularMeanings$1;
        Object objM24257d = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16156e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16158g;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    str6 = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16154c;
                    str5 = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16153b;
                    str4 = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16152a;
                    AbstractC3193b.m15359b(objM24257d);
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = tokenDataRepositoryImpl$fetchPopularMeanings$2.f16155d;
                    AbstractC3193b.m15359b(objM24257d);
                }
                return Boolean.valueOf(list.isEmpty());
            }
            AbstractC3193b.m15359b(objM24257d);
            x3a x3aVar = this.f16560b;
            Boolean bool = Boolean.TRUE;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16152a = str;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16153b = str2;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16154c = str3;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16158g = 1;
            objM24257d = x3aVar.m24257d(str, str2, bool, str3, tokenDataRepositoryImpl$fetchPopularMeanings$2);
            if (objM24257d != coroutineSingletons) {
                str4 = str;
                str5 = str2;
                str6 = str3;
            }
            return coroutineSingletons;
            List list2 = (List) objM24257d;
            v3a v3aVar = this.f16559a;
            String strM23629f = vz1.m23629f(str4, vz1.m23609O(str5, str4));
            List list3 = list2;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(psc.m19473a((ResultMeaning) it.next()));
            }
            f4a f4aVar = new f4a(strM23629f, str6, arrayList);
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16152a = null;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16153b = null;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16154c = null;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16155d = list2;
            tokenDataRepositoryImpl$fetchPopularMeanings$2.f16158g = 2;
            if (v3aVar.m23083a(f4aVar, tokenDataRepositoryImpl$fetchPopularMeanings$2) != coroutineSingletons) {
                list = list2;
                return Boolean.valueOf(list.isEmpty());
            }
            return coroutineSingletons;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public final Object m7378d(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$fetchRelatedPhrases$1 tokenDataRepositoryImpl$fetchRelatedPhrases$1;
        String str4;
        String str5;
        String str6;
        if (continuationImpl instanceof TokenDataRepositoryImpl$fetchRelatedPhrases$1) {
            tokenDataRepositoryImpl$fetchRelatedPhrases$1 = (TokenDataRepositoryImpl$fetchRelatedPhrases$1) continuationImpl;
            int i2 = tokenDataRepositoryImpl$fetchRelatedPhrases$1.f16165g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$fetchRelatedPhrases$1.f16165g = i2 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$fetchRelatedPhrases$1 = new TokenDataRepositoryImpl$fetchRelatedPhrases$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$fetchRelatedPhrases$1 = new TokenDataRepositoryImpl$fetchRelatedPhrases$1(this, continuationImpl);
        }
        TokenDataRepositoryImpl$fetchRelatedPhrases$1 tokenDataRepositoryImpl$fetchRelatedPhrases$2 = tokenDataRepositoryImpl$fetchRelatedPhrases$1;
        Object objM24256c = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16163e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16165g;
        xfa xfaVar = xfa.f68157a;
        int i4 = 2;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM24256c);
                x3a x3aVar = this.f16560b;
                Integer num = new Integer(i);
                tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16159a = str;
                tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16160b = str2;
                tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16161c = str3;
                tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16162d = i;
                tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16165g = 1;
                objM24256c = x3aVar.m24256c(str, str2, str3, num, tokenDataRepositoryImpl$fetchRelatedPhrases$2);
                if (objM24256c != coroutineSingletons) {
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC3193b.m15359b(objM24256c);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16162d;
            str6 = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16161c;
            str5 = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16160b;
            str4 = tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16159a;
            AbstractC3193b.m15359b(objM24256c);
            v3a v3aVar = this.f16559a;
            String str7 = vz1.m23629f(str4, vz1.m23609O(str5, str4)) + "_" + str6;
            List list = (List) objM24256c;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(xtc.m24702b((ResultRelatedPhrase) it.next()));
            }
            b5a b5aVar = new b5a(str7, arrayList);
            tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16159a = null;
            tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16160b = null;
            tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16161c = null;
            tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16162d = i;
            tokenDataRepositoryImpl$fetchRelatedPhrases$2.f16165g = 2;
            Object objM2861d = AbstractC0758a.m2861d(new r3a(i4, v3aVar, b5aVar), v3aVar.f64796a, tokenDataRepositoryImpl$fetchRelatedPhrases$2, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX INFO: renamed from: e */
    public final Object m7379e(String str, int i, int i2, int i3, boolean z, int i4, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$fetchTokenCwt$1 tokenDataRepositoryImpl$fetchTokenCwt$1;
        int i5;
        Object objM24260g;
        Object objM24258e;
        ResultTokenCwt resultTokenCwt;
        boolean z2;
        o3a o3aVar;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        boolean z3 = z;
        int i9 = i4;
        if (continuationImpl instanceof TokenDataRepositoryImpl$fetchTokenCwt$1) {
            tokenDataRepositoryImpl$fetchTokenCwt$1 = (TokenDataRepositoryImpl$fetchTokenCwt$1) continuationImpl;
            int i10 = tokenDataRepositoryImpl$fetchTokenCwt$1.f16174i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$fetchTokenCwt$1.f16174i = i10 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$fetchTokenCwt$1 = new TokenDataRepositoryImpl$fetchTokenCwt$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$fetchTokenCwt$1 = new TokenDataRepositoryImpl$fetchTokenCwt$1(this, continuationImpl);
        }
        TokenDataRepositoryImpl$fetchTokenCwt$1 tokenDataRepositoryImpl$fetchTokenCwt$2 = tokenDataRepositoryImpl$fetchTokenCwt$1;
        Object obj = tokenDataRepositoryImpl$fetchTokenCwt$2.f16172g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16174i;
        try {
            if (i11 == 0) {
                AbstractC3193b.m15359b(obj);
                x3a x3aVar = this.f16560b;
                if (z3) {
                    Integer num = new Integer(i6);
                    Integer num2 = new Integer(i9);
                    Integer num3 = new Integer(i7);
                    Integer num4 = new Integer(i8);
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16167b = i6;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16168c = i7;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16169d = i8;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16171f = z3;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16170e = i9;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16174i = 2;
                    i5 = 3;
                    objM24260g = x3aVar.m24260g(str, num, num2, num3, num4, tokenDataRepositoryImpl$fetchTokenCwt$2);
                    if (objM24260g == coroutineSingletons) {
                        tokenDataRepositoryImpl$fetchTokenCwt$2 = tokenDataRepositoryImpl$fetchTokenCwt$2;
                    } else {
                        tokenDataRepositoryImpl$fetchTokenCwt$2 = tokenDataRepositoryImpl$fetchTokenCwt$2;
                        resultTokenCwt = (ResultTokenCwt) objM24260g;
                    }
                } else {
                    Integer num5 = new Integer(i6);
                    Integer num6 = new Integer(i7);
                    Integer num7 = new Integer(i8);
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16167b = i6;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16168c = i7;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16169d = i8;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16171f = z3;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16170e = i9;
                    tokenDataRepositoryImpl$fetchTokenCwt$2.f16174i = 1;
                    objM24258e = x3aVar.m24258e(str, num5, num6, num7, tokenDataRepositoryImpl$fetchTokenCwt$2);
                    if (objM24258e != coroutineSingletons) {
                        resultTokenCwt = (ResultTokenCwt) objM24258e;
                        i5 = 3;
                    }
                }
                return coroutineSingletons;
            }
            if (i11 == 1) {
                int i12 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16170e;
                boolean z4 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16171f;
                i8 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16169d;
                int i13 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16168c;
                int i14 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16167b;
                AbstractC3193b.m15359b(obj);
                i9 = i12;
                i6 = i14;
                z3 = z4;
                i7 = i13;
                objM24258e = obj;
                resultTokenCwt = (ResultTokenCwt) objM24258e;
                i5 = 3;
            } else if (i11 == 2) {
                int i15 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16170e;
                boolean z5 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16171f;
                i8 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16169d;
                int i16 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16168c;
                int i17 = tokenDataRepositoryImpl$fetchTokenCwt$2.f16167b;
                AbstractC3193b.m15359b(obj);
                i9 = i15;
                i6 = i17;
                z3 = z5;
                i7 = i16;
                objM24260g = obj;
                i5 = 3;
                tokenDataRepositoryImpl$fetchTokenCwt$2 = tokenDataRepositoryImpl$fetchTokenCwt$2;
                resultTokenCwt = (ResultTokenCwt) objM24260g;
            } else {
                if (i11 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o3aVar = tokenDataRepositoryImpl$fetchTokenCwt$2.f16166a;
                AbstractC3193b.m15359b(obj);
                z2 = true;
            }
            return Boolean.valueOf(o3aVar.f53806g.length() > 0 ? z2 : false);
            o3a o3aVarM15701g = kuc.m15701g(resultTokenCwt, i6, i7, i8);
            v3a v3aVar = this.f16559a;
            o3a o3aVarM15701g2 = kuc.m15701g(resultTokenCwt, i6, i7, i8);
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16166a = o3aVarM15701g;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16167b = i6;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16168c = i7;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16169d = i8;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16171f = z3;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16170e = i9;
            tokenDataRepositoryImpl$fetchTokenCwt$2.f16174i = i5;
            z2 = true;
            Object objM2861d = AbstractC0758a.m2861d(new sx7(29, v3aVar, o3aVarM15701g2), v3aVar.f64796a, tokenDataRepositoryImpl$fetchTokenCwt$2, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfa.f68157a;
            }
            if (objM2861d != coroutineSingletons) {
                o3aVar = o3aVarM15701g;
                return Boolean.valueOf(o3aVar.f53806g.length() > 0 ? z2 : false);
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final Object m7380f(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$fetchTokenTranslations$1 tokenDataRepositoryImpl$fetchTokenTranslations$1;
        ResultTranslationGoogle resultTranslationGoogle;
        if (continuationImpl instanceof TokenDataRepositoryImpl$fetchTokenTranslations$1) {
            tokenDataRepositoryImpl$fetchTokenTranslations$1 = (TokenDataRepositoryImpl$fetchTokenTranslations$1) continuationImpl;
            int i = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16181g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$fetchTokenTranslations$1.f16181g = i - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$fetchTokenTranslations$1 = new TokenDataRepositoryImpl$fetchTokenTranslations$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$fetchTokenTranslations$1 = new TokenDataRepositoryImpl$fetchTokenTranslations$1(this, continuationImpl);
        }
        Object objM24259f = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16179e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16181g;
        boolean z = false;
        Object[] objArr = 0;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM24259f);
                x3a x3aVar = this.f16560b;
                RequestTranslate requestTranslate = new RequestTranslate(str, str2, str3, str4);
                tokenDataRepositoryImpl$fetchTokenTranslations$1.f16175a = str;
                tokenDataRepositoryImpl$fetchTokenTranslations$1.f16176b = str2;
                tokenDataRepositoryImpl$fetchTokenTranslations$1.f16177c = str3;
                tokenDataRepositoryImpl$fetchTokenTranslations$1.f16181g = 1;
                objM24259f = x3aVar.m24259f(str, requestTranslate, tokenDataRepositoryImpl$fetchTokenTranslations$1);
                if (objM24259f == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str3 = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16177c;
                str2 = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16176b;
                str = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16175a;
                AbstractC3193b.m15359b(objM24259f);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resultTranslationGoogle = tokenDataRepositoryImpl$fetchTokenTranslations$1.f16178d;
                AbstractC3193b.m15359b(objM24259f);
            }
            z = !resultTranslationGoogle.f21609a.isEmpty();
            return Boolean.valueOf(z);
            ResultTranslationGoogle resultTranslationGoogle2 = (ResultTranslationGoogle) objM24259f;
            String strM23629f = vz1.m23629f(str, vz1.m23629f(str2, vz1.m23609O(str3, str)));
            List<ResultTranslationSimple> list = resultTranslationGoogle2.f21609a;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            for (ResultTranslationSimple resultTranslationSimple : list) {
                resultTranslationSimple.getClass();
                arrayList.add(new TokenTranslationSimple(resultTranslationSimple.f21622a));
            }
            TranslationsEntity translationsEntity = new TranslationsEntity(strM23629f, arrayList);
            v3a v3aVar = this.f16559a;
            tokenDataRepositoryImpl$fetchTokenTranslations$1.f16175a = null;
            tokenDataRepositoryImpl$fetchTokenTranslations$1.f16176b = null;
            tokenDataRepositoryImpl$fetchTokenTranslations$1.f16177c = null;
            tokenDataRepositoryImpl$fetchTokenTranslations$1.f16178d = resultTranslationGoogle2;
            tokenDataRepositoryImpl$fetchTokenTranslations$1.f16181g = 2;
            Object objM2861d = AbstractC0758a.m2861d(new r3a(objArr == true ? 1 : 0, v3aVar, translationsEntity), v3aVar.f64796a, tokenDataRepositoryImpl$fetchTokenTranslations$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfa.f68157a;
            }
            if (objM2861d != coroutineSingletons) {
                resultTranslationGoogle = resultTranslationGoogle2;
                z = !resultTranslationGoogle.f21609a.isEmpty();
                return Boolean.valueOf(z);
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final c83 m7381g(String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
        v3a v3aVar = this.f16559a;
        v3aVar.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(v3aVar.f64796a, true, new String[]{"TokenPopularMeaningsEntity"}, new p3a(strM23629f, str3, v3aVar, 0)));
    }

    /* JADX INFO: renamed from: h */
    public final c83 m7382h(int i, int i2, int i3, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        o3a.Companion.getClass();
        String strM17202a = n3a.m17202a(i, i2, i3, str3, str, str2);
        v3a v3aVar = this.f16559a;
        v3aVar.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(v3aVar.f64796a, true, new String[]{"TokenCwtEntity"}, new ql4(strM17202a, 28)));
    }

    /* JADX INFO: renamed from: i */
    public final c83 m7383i(String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        String strM23629f = vz1.m23629f(str, vz1.m23629f(str2, vz1.m23609O(str3, str)));
        v3a v3aVar = this.f16559a;
        v3aVar.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(v3aVar.f64796a, true, new String[]{"TranslationsEntity"}, new q3a(strM23629f, v3aVar, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r6.m23083a(r7, r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7384j(String str, String str2, TokenMeaning tokenMeaning, String str3, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$removeMeaning$1 tokenDataRepositoryImpl$removeMeaning$1;
        if (continuationImpl instanceof TokenDataRepositoryImpl$removeMeaning$1) {
            tokenDataRepositoryImpl$removeMeaning$1 = (TokenDataRepositoryImpl$removeMeaning$1) continuationImpl;
            int i = tokenDataRepositoryImpl$removeMeaning$1.f16185d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$removeMeaning$1.f16185d = i - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$removeMeaning$1 = new TokenDataRepositoryImpl$removeMeaning$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$removeMeaning$1 = new TokenDataRepositoryImpl$removeMeaning$1(this, continuationImpl);
        }
        Object objM2861d = tokenDataRepositoryImpl$removeMeaning$1.f16183b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tokenDataRepositoryImpl$removeMeaning$1.f16185d;
        v3a v3aVar = this.f16559a;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                tokenMeaning = tokenDataRepositoryImpl$removeMeaning$1.f16182a;
                AbstractC3193b.m15359b(objM2861d);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM2861d);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2861d);
        String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
        tokenDataRepositoryImpl$removeMeaning$1.f16182a = tokenMeaning;
        tokenDataRepositoryImpl$removeMeaning$1.f16185d = 1;
        objM2861d = AbstractC0758a.m2861d(new p3a(strM23629f, str3, v3aVar, i3), v3aVar.f64796a, tokenDataRepositoryImpl$removeMeaning$1, true, true);
        if (objM2861d != coroutineSingletons) {
        }
        return coroutineSingletons;
        f4a f4aVar = (f4a) objM2861d;
        if (f4aVar != null) {
            List list = f4aVar.f38418c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TokenMeaning) obj).f19594a != tokenMeaning.f19594a) {
                    arrayList.add(obj);
                }
            }
            f4a f4aVarM11530a = f4a.m11530a(f4aVar, arrayList);
            tokenDataRepositoryImpl$removeMeaning$1.f16182a = null;
            tokenDataRepositoryImpl$removeMeaning$1.f16185d = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0168  */
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    /* JADX WARN: Code duplicated, block: B:50:0x0228 A[LOOP:0: B:49:0x0226->B:50:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (r11.m23083a(r7, r5) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
    
        r7 = r2;
        r2 = r1;
        r1 = r7;
        r11 = r9;
        r7 = r14;
        r14 = r10;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r11.m23083a(r4, r5) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0193, code lost:
    
        if (m7384j(r10, r9, r33, r8, r5) == r6) goto L45;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7385k(String str, String str2, TokenMeaning tokenMeaning, String str3, String str4, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        TokenDataRepositoryImpl$updateMeaning$1 tokenDataRepositoryImpl$updateMeaning$1;
        String strM23629f;
        TokenMeaning tokenMeaning2;
        String str5;
        String str6;
        Integer num2;
        String str7;
        String str8;
        String str9;
        TokenMeaning tokenMeaning3;
        Object obj;
        String str10;
        Integer num3;
        String str11;
        int i;
        String str12;
        C1306v c1306v;
        TokenMeaning tokenMeaning4;
        Pair[] pairArr;
        hi8 hi8Var;
        String str13 = str4;
        if (continuationImpl instanceof TokenDataRepositoryImpl$updateMeaning$1) {
            tokenDataRepositoryImpl$updateMeaning$1 = (TokenDataRepositoryImpl$updateMeaning$1) continuationImpl;
            int i2 = tokenDataRepositoryImpl$updateMeaning$1.f16196k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$updateMeaning$1.f16196k = i2 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$updateMeaning$1 = new TokenDataRepositoryImpl$updateMeaning$1(this, continuationImpl);
            }
        } else {
            tokenDataRepositoryImpl$updateMeaning$1 = new TokenDataRepositoryImpl$updateMeaning$1(this, continuationImpl);
        }
        Object obj2 = tokenDataRepositoryImpl$updateMeaning$1.f16194i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = tokenDataRepositoryImpl$updateMeaning$1.f16196k;
        v3a v3aVar = this.f16559a;
        int i4 = 1;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj2);
            strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            if (str13 == null) {
                tokenMeaning2 = tokenMeaning;
                str5 = str3;
                str6 = str;
                num2 = num;
                str7 = str2;
                str8 = str13;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    tokenDataRepositoryImpl$updateMeaning$1.f16186a = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16187b = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning2;
                    tokenDataRepositoryImpl$updateMeaning$1.f16189d = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16190e = str8;
                    tokenDataRepositoryImpl$updateMeaning$1.f16191f = num2;
                    tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16193h = iIntValue;
                    tokenDataRepositoryImpl$updateMeaning$1.f16196k = 5;
                    TokenMeaning tokenMeaning5 = tokenMeaning2;
                    c1306v = this;
                    tokenMeaning4 = tokenMeaning5;
                } else {
                    c1306v = this;
                }
                RequestHintUpdate requestHintUpdate = new RequestHintUpdate(str8, (String) null, (String) null, (Boolean) null, num2, 6);
                int i5 = tokenMeaning2.f19594a;
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                NetworkType networkType2 = NetworkType.CONNECTED;
                networkType2.getClass();
                ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
                tx6 tx6Var = (tx6) new tx6(HintUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                tx6Var.f46873c.f55781j = ak1Var;
                Pair pair = new Pair("id", Integer.valueOf(i5));
                df4 df4Var = c1306v.f16561c;
                df4Var.getClass();
                pairArr = new Pair[]{pair, new Pair("data", df4Var.m10322b(RequestHintUpdate.Companion.serializer(), requestHintUpdate))};
                hi8Var = new hi8(10);
                for (int i6 = 0; i6 < 2; i6++) {
                    Pair pair2 = pairArr[i6];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                c1306v.f16562d.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                return xfa.f68157a;
            }
            tokenDataRepositoryImpl$updateMeaning$1.f16186a = str;
            tokenDataRepositoryImpl$updateMeaning$1.f16187b = str2;
            tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning;
            tokenDataRepositoryImpl$updateMeaning$1.f16189d = str3;
            tokenDataRepositoryImpl$updateMeaning$1.f16190e = str13;
            tokenDataRepositoryImpl$updateMeaning$1.f16191f = num;
            tokenDataRepositoryImpl$updateMeaning$1.f16192g = strM23629f;
            tokenDataRepositoryImpl$updateMeaning$1.f16193h = 0;
            tokenDataRepositoryImpl$updateMeaning$1.f16196k = 1;
            Object objM2861d = AbstractC0758a.m2861d(new p3a(strM23629f, str13, v3aVar, i4), v3aVar.f64796a, tokenDataRepositoryImpl$updateMeaning$1, true, true);
            if (objM2861d != coroutineSingletons) {
                str9 = str3;
                tokenMeaning3 = tokenMeaning;
                obj = objM2861d;
                str10 = str;
                num3 = num;
                str11 = str2;
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i7 = tokenDataRepositoryImpl$updateMeaning$1.f16193h;
            String str14 = tokenDataRepositoryImpl$updateMeaning$1.f16192g;
            Integer num4 = tokenDataRepositoryImpl$updateMeaning$1.f16191f;
            String str15 = tokenDataRepositoryImpl$updateMeaning$1.f16190e;
            str9 = tokenDataRepositoryImpl$updateMeaning$1.f16189d;
            tokenMeaning3 = tokenDataRepositoryImpl$updateMeaning$1.f16188c;
            str11 = tokenDataRepositoryImpl$updateMeaning$1.f16187b;
            str10 = tokenDataRepositoryImpl$updateMeaning$1.f16186a;
            AbstractC3193b.m15359b(obj2);
            i = i7;
            num3 = num4;
            str13 = str15;
            obj = obj2;
            strM23629f = str14;
        } else {
            if (i3 == 2 || i3 == 3) {
                int i8 = tokenDataRepositoryImpl$updateMeaning$1.f16193h;
                Integer num5 = tokenDataRepositoryImpl$updateMeaning$1.f16191f;
                str13 = tokenDataRepositoryImpl$updateMeaning$1.f16190e;
                String str16 = tokenDataRepositoryImpl$updateMeaning$1.f16189d;
                TokenMeaning tokenMeaning6 = tokenDataRepositoryImpl$updateMeaning$1.f16188c;
                String str17 = tokenDataRepositoryImpl$updateMeaning$1.f16187b;
                String str18 = tokenDataRepositoryImpl$updateMeaning$1.f16186a;
                AbstractC3193b.m15359b(obj2);
                tokenDataRepositoryImpl$updateMeaning$1.f16186a = str18;
                tokenDataRepositoryImpl$updateMeaning$1.f16187b = str17;
                tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning6;
                tokenDataRepositoryImpl$updateMeaning$1.f16189d = str16;
                tokenDataRepositoryImpl$updateMeaning$1.f16190e = str13;
                tokenDataRepositoryImpl$updateMeaning$1.f16191f = num5;
                tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
                tokenDataRepositoryImpl$updateMeaning$1.f16193h = i8;
                tokenDataRepositoryImpl$updateMeaning$1.f16196k = 4;
                if (m7384j(str18, str17, tokenMeaning6, str16, tokenDataRepositoryImpl$updateMeaning$1) != coroutineSingletons) {
                    num2 = num5;
                    str8 = str13;
                    str12 = str16;
                    tokenMeaning2 = tokenMeaning6;
                    str7 = str17;
                    str6 = str18;
                    str5 = str12;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        tokenDataRepositoryImpl$updateMeaning$1.f16186a = null;
                        tokenDataRepositoryImpl$updateMeaning$1.f16187b = null;
                        tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning2;
                        tokenDataRepositoryImpl$updateMeaning$1.f16189d = null;
                        tokenDataRepositoryImpl$updateMeaning$1.f16190e = str8;
                        tokenDataRepositoryImpl$updateMeaning$1.f16191f = num2;
                        tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
                        tokenDataRepositoryImpl$updateMeaning$1.f16193h = iIntValue2;
                        tokenDataRepositoryImpl$updateMeaning$1.f16196k = 5;
                        TokenMeaning tokenMeaning7 = tokenMeaning2;
                        c1306v = this;
                        tokenMeaning4 = tokenMeaning7;
                    } else {
                        c1306v = this;
                    }
                    RequestHintUpdate requestHintUpdate2 = new RequestHintUpdate(str8, (String) null, (String) null, (Boolean) null, num2, 6);
                    int i9 = tokenMeaning2.f19594a;
                    NetworkType networkType3 = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    NetworkType networkType4 = NetworkType.CONNECTED;
                    networkType4.getClass();
                    ak1 ak1Var2 = new ak1(new gk6(null), networkType4, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet2));
                    tx6 tx6Var2 = (tx6) new tx6(HintUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                    tx6Var2.f46873c.f55781j = ak1Var2;
                    Pair pair3 = new Pair("id", Integer.valueOf(i9));
                    df4 df4Var2 = c1306v.f16561c;
                    df4Var2.getClass();
                    pairArr = new Pair[]{pair3, new Pair("data", df4Var2.m10322b(RequestHintUpdate.Companion.serializer(), requestHintUpdate2))};
                    hi8Var = new hi8(10);
                    while (i6 < 2) {
                        Pair pair4 = pairArr[i6];
                        hi8Var.m13287x(pair4.f47624b, (String) pair4.f47623a);
                    }
                    c1306v.f16562d.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
                    return xfa.f68157a;
                }
                return coroutineSingletons;
            }
            if (i3 == 4) {
                num2 = tokenDataRepositoryImpl$updateMeaning$1.f16191f;
                str8 = tokenDataRepositoryImpl$updateMeaning$1.f16190e;
                str12 = tokenDataRepositoryImpl$updateMeaning$1.f16189d;
                tokenMeaning2 = tokenDataRepositoryImpl$updateMeaning$1.f16188c;
                str7 = tokenDataRepositoryImpl$updateMeaning$1.f16187b;
                str6 = tokenDataRepositoryImpl$updateMeaning$1.f16186a;
                AbstractC3193b.m15359b(obj2);
                str5 = str12;
                if (num2 != null) {
                    int iIntValue3 = num2.intValue();
                    tokenDataRepositoryImpl$updateMeaning$1.f16186a = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16187b = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning2;
                    tokenDataRepositoryImpl$updateMeaning$1.f16189d = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16190e = str8;
                    tokenDataRepositoryImpl$updateMeaning$1.f16191f = num2;
                    tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
                    tokenDataRepositoryImpl$updateMeaning$1.f16193h = iIntValue3;
                    tokenDataRepositoryImpl$updateMeaning$1.f16196k = 5;
                    TokenMeaning tokenMeaning8 = tokenMeaning2;
                    c1306v = this;
                    tokenMeaning4 = tokenMeaning8;
                } else {
                    c1306v = this;
                }
                RequestHintUpdate requestHintUpdate3 = new RequestHintUpdate(str8, (String) null, (String) null, (Boolean) null, num2, 6);
                int i10 = tokenMeaning2.f19594a;
                NetworkType networkType5 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                NetworkType networkType6 = NetworkType.CONNECTED;
                networkType6.getClass();
                ak1 ak1Var3 = new ak1(new gk6(null), networkType6, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet3));
                tx6 tx6Var3 = (tx6) new tx6(HintUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                tx6Var3.f46873c.f55781j = ak1Var3;
                Pair pair5 = new Pair("id", Integer.valueOf(i10));
                df4 df4Var3 = c1306v.f16561c;
                df4Var3.getClass();
                pairArr = new Pair[]{pair5, new Pair("data", df4Var3.m10322b(RequestHintUpdate.Companion.serializer(), requestHintUpdate3))};
                hi8Var = new hi8(10);
                while (i6 < 2) {
                    Pair pair6 = pairArr[i6];
                    hi8Var.m13287x(pair6.f47624b, (String) pair6.f47623a);
                }
                c1306v.f16562d.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                return xfa.f68157a;
            }
            if (i3 != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num2 = tokenDataRepositoryImpl$updateMeaning$1.f16191f;
            str8 = tokenDataRepositoryImpl$updateMeaning$1.f16190e;
            tokenMeaning4 = tokenDataRepositoryImpl$updateMeaning$1.f16188c;
            AbstractC3193b.m15359b(obj2);
            c1306v = this;
        }
        tokenMeaning2 = tokenMeaning4;
        RequestHintUpdate requestHintUpdate4 = new RequestHintUpdate(str8, (String) null, (String) null, (Boolean) null, num2, 6);
        int i11 = tokenMeaning2.f19594a;
        NetworkType networkType7 = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        NetworkType networkType8 = NetworkType.CONNECTED;
        networkType8.getClass();
        ak1 ak1Var4 = new ak1(new gk6(null), networkType8, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet4));
        tx6 tx6Var4 = (tx6) new tx6(HintUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
        tx6Var4.f46873c.f55781j = ak1Var4;
        Pair pair7 = new Pair("id", Integer.valueOf(i11));
        df4 df4Var4 = c1306v.f16561c;
        df4Var4.getClass();
        pairArr = new Pair[]{pair7, new Pair("data", df4Var4.m10322b(RequestHintUpdate.Companion.serializer(), requestHintUpdate4))};
        hi8Var = new hi8(10);
        while (i6 < 2) {
            Pair pair8 = pairArr[i6];
            hi8Var.m13287x(pair8.f47624b, (String) pair8.f47623a);
        }
        c1306v.f16562d.m2912a((ux6) ((tx6) tx6Var4.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        f4a f4aVar = (f4a) obj;
        if (f4aVar == null) {
            f4a f4aVar2 = new f4a(strM23629f, str13, vz1.m23604J(TokenMeaning.m8127a(tokenMeaning3, 0, str13, null, 1021)));
            tokenDataRepositoryImpl$updateMeaning$1.f16186a = str10;
            tokenDataRepositoryImpl$updateMeaning$1.f16187b = str11;
            tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning3;
            tokenDataRepositoryImpl$updateMeaning$1.f16189d = str9;
            tokenDataRepositoryImpl$updateMeaning$1.f16190e = str13;
            tokenDataRepositoryImpl$updateMeaning$1.f16191f = num3;
            tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
            tokenDataRepositoryImpl$updateMeaning$1.f16193h = i;
            tokenDataRepositoryImpl$updateMeaning$1.f16196k = 2;
        } else {
            ArrayList arrayListM22624p1 = u91.m22624p1(f4aVar.f38418c);
            arrayListM22624p1.add(TokenMeaning.m8127a(tokenMeaning3, 0, str13, null, 1021));
            f4a f4aVarM11530a = f4a.m11530a(f4aVar, arrayListM22624p1);
            tokenDataRepositoryImpl$updateMeaning$1.f16186a = str10;
            tokenDataRepositoryImpl$updateMeaning$1.f16187b = str11;
            tokenDataRepositoryImpl$updateMeaning$1.f16188c = tokenMeaning3;
            tokenDataRepositoryImpl$updateMeaning$1.f16189d = str9;
            tokenDataRepositoryImpl$updateMeaning$1.f16190e = str13;
            tokenDataRepositoryImpl$updateMeaning$1.f16191f = num3;
            tokenDataRepositoryImpl$updateMeaning$1.f16192g = null;
            tokenDataRepositoryImpl$updateMeaning$1.f16193h = i;
            tokenDataRepositoryImpl$updateMeaning$1.f16196k = 3;
        }
        return coroutineSingletons;
    }
}
