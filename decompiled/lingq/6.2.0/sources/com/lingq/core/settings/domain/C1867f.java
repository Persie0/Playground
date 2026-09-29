package com.lingq.core.settings.domain;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.c83;
import p000.si7;
import p000.ua3;
import p000.vz1;
import p000.xfa;
import p000.xv7;
import p000.yi7;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1867f {

    /* JADX INFO: renamed from: a */
    public final si7 f22940a;

    public C1867f(si7 si7Var, int i) {
        si7Var.getClass();
        switch (i) {
            case 1:
                this.f22940a = si7Var;
                break;
            case 2:
                this.f22940a = si7Var;
                break;
            default:
                this.f22940a = si7Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r10).m7856O(r6, r0) == r1) goto L38;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8628a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        SetReaderLineSpacingUseCase$invoke$1 setReaderLineSpacingUseCase$invoke$1;
        String str2;
        List list;
        int i2;
        int i3;
        if (continuationImpl instanceof SetReaderLineSpacingUseCase$invoke$1) {
            setReaderLineSpacingUseCase$invoke$1 = (SetReaderLineSpacingUseCase$invoke$1) continuationImpl;
            int i4 = setReaderLineSpacingUseCase$invoke$1.f22822f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setReaderLineSpacingUseCase$invoke$1.f22822f = i4 - Integer.MIN_VALUE;
            } else {
                setReaderLineSpacingUseCase$invoke$1 = new SetReaderLineSpacingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setReaderLineSpacingUseCase$invoke$1 = new SetReaderLineSpacingUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = setReaderLineSpacingUseCase$invoke$1.f22820d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setReaderLineSpacingUseCase$invoke$1.f22822f;
        si7 si7Var = this.f22940a;
        if (i5 != 0) {
            if (i5 == 1) {
                i = setReaderLineSpacingUseCase$invoke$1.f22817a;
                list = setReaderLineSpacingUseCase$invoke$1.f22819c;
                str2 = setReaderLineSpacingUseCase$invoke$1.f22818b;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i5 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = setReaderLineSpacingUseCase$invoke$1.f22819c;
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        List list3 = ua3.f63637b;
        yi7 yi7Var = ((C1368a) si7Var).f18329C0;
        setReaderLineSpacingUseCase$invoke$1.f22818b = str;
        setReaderLineSpacingUseCase$invoke$1.f22819c = list3;
        setReaderLineSpacingUseCase$invoke$1.f22817a = i;
        setReaderLineSpacingUseCase$invoke$1.f22822f = 1;
        Object objM15541t = AbstractC3224d.m15541t(yi7Var, setReaderLineSpacingUseCase$invoke$1);
        if (objM15541t != coroutineSingletons) {
            str2 = str;
            list = list3;
            obj = objM15541t;
        }
        return coroutineSingletons;
        double dDoubleValue = ((Number) obj).doubleValue();
        int iIndexOf = list.indexOf(new Double(dDoubleValue));
        if (i < 0 && (i3 = iIndexOf - 1) >= 0) {
            str2.getClass();
            double d = 0.65d;
            if (!AbstractC3550rv.m20855w0(new String[]{LanguageLearn.Japanese.getCode(), LanguageLearn.Mandarin.getCode(), LanguageLearn.ChineseTraditional.getCode(), LanguageLearn.Cantonese.getCode()}).contains(str2) && !AbstractC3184kh.m15230y(str2)) {
                d = 0.35d;
            }
            dDoubleValue = Math.max(d, ((Number) list.get(i3)).doubleValue());
        } else if (i > 0 && (i2 = iIndexOf + 1) < list.size()) {
            dDoubleValue = ((Number) list.get(i2)).doubleValue();
        }
        setReaderLineSpacingUseCase$invoke$1.f22818b = null;
        setReaderLineSpacingUseCase$invoke$1.f22819c = null;
        setReaderLineSpacingUseCase$invoke$1.f22817a = i;
        setReaderLineSpacingUseCase$invoke$1.f22822f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r6).m7854M(r9, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8629b(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        SetReaderFontUseCase$invoke$1 setReaderFontUseCase$invoke$1;
        ReaderFont readerFontM24711b;
        if (continuationImpl instanceof SetReaderFontUseCase$invoke$1) {
            setReaderFontUseCase$invoke$1 = (SetReaderFontUseCase$invoke$1) continuationImpl;
            int i = setReaderFontUseCase$invoke$1.f22816e;
            if ((i & Integer.MIN_VALUE) != 0) {
                setReaderFontUseCase$invoke$1.f22816e = i - Integer.MIN_VALUE;
            } else {
                setReaderFontUseCase$invoke$1 = new SetReaderFontUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setReaderFontUseCase$invoke$1 = new SetReaderFontUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = setReaderFontUseCase$invoke$1.f22814c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setReaderFontUseCase$invoke$1.f22816e;
        si7 si7Var = this.f22940a;
        if (i2 != 0) {
            if (i2 == 1) {
                readerFontM24711b = setReaderFontUseCase$invoke$1.f22813b;
                str2 = setReaderFontUseCase$invoke$1.f22812a;
                AbstractC3193b.m15359b(objM15541t);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM15541t);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM15541t);
        ReaderFont.Companion.getClass();
        readerFontM24711b = xv7.m24711b(str);
        c83 c83Var = ((C1368a) si7Var).f18466z0;
        setReaderFontUseCase$invoke$1.f22812a = str2;
        setReaderFontUseCase$invoke$1.f22813b = readerFontM24711b;
        setReaderFontUseCase$invoke$1.f22816e = 1;
        objM15541t = AbstractC3224d.m15541t(c83Var, setReaderFontUseCase$invoke$1);
        if (objM15541t != coroutineSingletons) {
        }
        return coroutineSingletons;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(str2, readerFontM24711b);
        setReaderFontUseCase$invoke$1.f22812a = null;
        setReaderFontUseCase$invoke$1.f22813b = null;
        setReaderFontUseCase$invoke$1.f22816e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r9).m7844C(r12, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8630c(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        SyncFeedLevelsFromLanguageUseCase$invoke$1 syncFeedLevelsFromLanguageUseCase$invoke$1;
        if (continuationImpl instanceof SyncFeedLevelsFromLanguageUseCase$invoke$1) {
            syncFeedLevelsFromLanguageUseCase$invoke$1 = (SyncFeedLevelsFromLanguageUseCase$invoke$1) continuationImpl;
            int i = syncFeedLevelsFromLanguageUseCase$invoke$1.f22867e;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncFeedLevelsFromLanguageUseCase$invoke$1.f22867e = i - Integer.MIN_VALUE;
            } else {
                syncFeedLevelsFromLanguageUseCase$invoke$1 = new SyncFeedLevelsFromLanguageUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            syncFeedLevelsFromLanguageUseCase$invoke$1 = new SyncFeedLevelsFromLanguageUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = syncFeedLevelsFromLanguageUseCase$invoke$1.f22865c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = syncFeedLevelsFromLanguageUseCase$invoke$1.f22867e;
        si7 si7Var = this.f22940a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1368a) si7Var).f18407f1;
            syncFeedLevelsFromLanguageUseCase$invoke$1.f22863a = str;
            syncFeedLevelsFromLanguageUseCase$invoke$1.f22864b = list;
            syncFeedLevelsFromLanguageUseCase$invoke$1.f22867e = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, syncFeedLevelsFromLanguageUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            list = syncFeedLevelsFromLanguageUseCase$invoke$1.f22864b;
            str = syncFeedLevelsFromLanguageUseCase$invoke$1.f22863a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = syncFeedLevelsFromLanguageUseCase$invoke$1.f22864b;
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = 0;
        for (Object obj : LearningLevel.getEntries()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                vz1.m23628e0();
                throw null;
            }
            linkedHashMap.put((LearningLevel) obj, Boolean.valueOf(Boolean.parseBoolean((String) list.get(i3))));
            i3 = i4;
        }
        linkedHashMapM15372Y.put(str, linkedHashMap);
        syncFeedLevelsFromLanguageUseCase$invoke$1.f22863a = null;
        syncFeedLevelsFromLanguageUseCase$invoke$1.f22864b = null;
        syncFeedLevelsFromLanguageUseCase$invoke$1.f22867e = 2;
    }
}
