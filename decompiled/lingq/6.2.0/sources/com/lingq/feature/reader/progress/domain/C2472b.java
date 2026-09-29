package com.lingq.feature.reader.progress.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1310z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.bz5;
import p000.hm5;
import p000.ox7;
import p000.s7b;
import p000.v91;
import p000.xz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.progress.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2472b {

    /* JADX INFO: renamed from: a */
    public final s7b f29911a;

    /* JADX INFO: renamed from: b */
    public final hm5 f29912b;

    /* JADX INFO: renamed from: c */
    public final bz5 f29913c;

    public C2472b(s7b s7bVar, hm5 hm5Var, bz5 bz5Var, int i) {
        s7bVar.getClass();
        hm5Var.getClass();
        bz5Var.getClass();
        switch (i) {
            case 1:
                this.f29911a = s7bVar;
                this.f29912b = hm5Var;
                this.f29913c = bz5Var;
                break;
            default:
                this.f29911a = s7bVar;
                this.f29912b = hm5Var;
                this.f29913c = bz5Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m9377a(String str, int i, ox7 ox7Var, String str2, ContinuationImpl continuationImpl) throws Throwable {
        MovePageWordsToKnownUseCase$invoke$1 movePageWordsToKnownUseCase$invoke$1;
        int iIntValue;
        int i2;
        if (continuationImpl instanceof MovePageWordsToKnownUseCase$invoke$1) {
            movePageWordsToKnownUseCase$invoke$1 = (MovePageWordsToKnownUseCase$invoke$1) continuationImpl;
            int i3 = movePageWordsToKnownUseCase$invoke$1.f29883f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                movePageWordsToKnownUseCase$invoke$1.f29883f = i3 - Integer.MIN_VALUE;
            } else {
                movePageWordsToKnownUseCase$invoke$1 = new MovePageWordsToKnownUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            movePageWordsToKnownUseCase$invoke$1 = new MovePageWordsToKnownUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7430i = movePageWordsToKnownUseCase$invoke$1.f29881d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = movePageWordsToKnownUseCase$invoke$1.f29883f;
        if (i4 != 0) {
            if (i4 == 1) {
                i = movePageWordsToKnownUseCase$invoke$1.f29879b;
                str2 = movePageWordsToKnownUseCase$invoke$1.f29878a;
                AbstractC3193b.m15359b(objM7430i);
            } else {
                if (i4 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = movePageWordsToKnownUseCase$invoke$1.f29880c;
                AbstractC3193b.m15359b(objM7430i);
            }
            iIntValue = i2;
            return new Integer(iIntValue);
        }
        AbstractC3193b.m15359b(objM7430i);
        List list = ox7Var.f55132e;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xz7) it.next()).f69008e);
        }
        movePageWordsToKnownUseCase$invoke$1.f29878a = str2;
        movePageWordsToKnownUseCase$invoke$1.f29879b = i;
        movePageWordsToKnownUseCase$invoke$1.f29883f = 1;
        objM7430i = ((C1310z) this.f29911a).m7430i(str, i, arrayList, movePageWordsToKnownUseCase$invoke$1);
        if (objM7430i != coroutineSingletons) {
        }
        return coroutineSingletons;
        iIntValue = ((Number) objM7430i).intValue();
        if (iIntValue > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("paging type", str2);
            bundle.putInt("n words to known", iIntValue);
            ((C1240a) this.f29912b).m7025f("Word(s) paged to known", bundle);
            movePageWordsToKnownUseCase$invoke$1.f29878a = null;
            movePageWordsToKnownUseCase$invoke$1.f29879b = i;
            movePageWordsToKnownUseCase$invoke$1.f29880c = iIntValue;
            movePageWordsToKnownUseCase$invoke$1.f29883f = 2;
            if (this.f29913c.mo4239l2(2000L, movePageWordsToKnownUseCase$invoke$1) != coroutineSingletons) {
                i2 = iIntValue;
                iIntValue = i2;
            }
            return coroutineSingletons;
        }
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m9378b(String str, int i, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        MarkSentenceWordsKnownUseCase$invoke$1 markSentenceWordsKnownUseCase$invoke$1;
        int iIntValue;
        int i2;
        if (continuationImpl instanceof MarkSentenceWordsKnownUseCase$invoke$1) {
            markSentenceWordsKnownUseCase$invoke$1 = (MarkSentenceWordsKnownUseCase$invoke$1) continuationImpl;
            int i3 = markSentenceWordsKnownUseCase$invoke$1.f29877e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                markSentenceWordsKnownUseCase$invoke$1.f29877e = i3 - Integer.MIN_VALUE;
            } else {
                markSentenceWordsKnownUseCase$invoke$1 = new MarkSentenceWordsKnownUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            markSentenceWordsKnownUseCase$invoke$1 = new MarkSentenceWordsKnownUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7430i = markSentenceWordsKnownUseCase$invoke$1.f29875c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = markSentenceWordsKnownUseCase$invoke$1.f29877e;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM7430i);
            if (arrayList.isEmpty()) {
                return new Integer(0);
            }
            markSentenceWordsKnownUseCase$invoke$1.f29873a = i;
            markSentenceWordsKnownUseCase$invoke$1.f29877e = 1;
            objM7430i = ((C1310z) this.f29911a).m7430i(str, i, arrayList, markSentenceWordsKnownUseCase$invoke$1);
            if (objM7430i != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = markSentenceWordsKnownUseCase$invoke$1.f29873a;
            AbstractC3193b.m15359b(objM7430i);
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = markSentenceWordsKnownUseCase$invoke$1.f29874b;
            AbstractC3193b.m15359b(objM7430i);
        }
        iIntValue = i2;
        return new Integer(iIntValue);
        iIntValue = ((Number) objM7430i).intValue();
        if (iIntValue > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("paging type", "video_sentence");
            bundle.putInt("n words to known", iIntValue);
            ((C1240a) this.f29912b).m7025f("Word(s) paged to known", bundle);
            markSentenceWordsKnownUseCase$invoke$1.f29873a = i;
            markSentenceWordsKnownUseCase$invoke$1.f29874b = iIntValue;
            markSentenceWordsKnownUseCase$invoke$1.f29877e = 2;
            if (this.f29913c.mo4239l2(2000L, markSentenceWordsKnownUseCase$invoke$1) != coroutineSingletons) {
                i2 = iIntValue;
                iIntValue = i2;
            }
            return coroutineSingletons;
        }
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:16:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public java.lang.Object m9379c(int r14, java.lang.String r15, java.lang.String r16, java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r13 = this;
            r1 = r18
            boolean r2 = r1 instanceof com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase$moveMultiplePages$1
            if (r2 == 0) goto L15
            r2 = r1
            com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase$moveMultiplePages$1 r2 = (com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase$moveMultiplePages$1) r2
            int r3 = r2.f29892i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.f29892i = r3
            goto L1a
        L15:
            com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase$moveMultiplePages$1 r2 = new com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase$moveMultiplePages$1
            r2.<init>(r13, r1)
        L1a:
            java.lang.Object r1 = r2.f29890g
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r2.f29892i
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L49
            if (r3 == r8) goto L36
            if (r3 != r7) goto L30
            int r0 = r2.f29888e
            kotlin.AbstractC3193b.m15359b(r1)
            goto La5
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r0)
            return r9
        L36:
            int r3 = r2.f29889f
            int r4 = r2.f29887d
            java.util.Iterator r5 = r2.f29886c
            java.lang.String r10 = r2.f29885b
            java.lang.String r11 = r2.f29884a
            kotlin.AbstractC3193b.m15359b(r1)
            r12 = r5
            r5 = r2
            r2 = r4
            r4 = r10
        L47:
            r10 = r12
            goto L7f
        L49:
            kotlin.AbstractC3193b.m15359b(r1)
            java.util.Iterator r1 = r17.iterator()
            r3 = 0
            r4 = r16
            r11 = r1
            r5 = r2
            r10 = r3
            r2 = r14
            r1 = r15
        L58:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r11.next()
            ox7 r3 = (p000.ox7) r3
            r5.f29884a = r1
            r5.f29885b = r4
            r5.f29886c = r11
            r5.f29887d = r2
            r5.f29888e = r10
            r5.f29889f = r10
            r5.f29892i = r8
            r0 = r13
            java.lang.Object r3 = r0.m9380d(r1, r2, r3, r4, r5)
            if (r3 != r6) goto L7a
            goto La3
        L7a:
            r12 = r11
            r11 = r1
            r1 = r3
            r3 = r10
            goto L47
        L7f:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r3
            r12 = r10
            r10 = r1
            r1 = r11
            r11 = r12
            goto L58
        L8b:
            if (r10 <= 0) goto La6
            r5.f29884a = r9
            r5.f29885b = r9
            r5.f29886c = r9
            r5.f29887d = r2
            r5.f29888e = r10
            r5.f29892i = r7
            bz5 r0 = r13.f29913c
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = r0.mo4239l2(r1, r5)
            if (r0 != r6) goto La4
        La3:
            return r6
        La4:
            r0 = r10
        La5:
            r10 = r0
        La6:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.progress.domain.C2472b.m9379c(int, java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m9380d(String str, int i, ox7 ox7Var, String str2, ContinuationImpl continuationImpl) throws Throwable {
        MovePageWordsToKnownUseCase$movePageWords$1 movePageWordsToKnownUseCase$movePageWords$1;
        if (continuationImpl instanceof MovePageWordsToKnownUseCase$movePageWords$1) {
            movePageWordsToKnownUseCase$movePageWords$1 = (MovePageWordsToKnownUseCase$movePageWords$1) continuationImpl;
            int i2 = movePageWordsToKnownUseCase$movePageWords$1.f29896d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                movePageWordsToKnownUseCase$movePageWords$1.f29896d = i2 - Integer.MIN_VALUE;
            } else {
                movePageWordsToKnownUseCase$movePageWords$1 = new MovePageWordsToKnownUseCase$movePageWords$1(this, continuationImpl);
            }
        } else {
            movePageWordsToKnownUseCase$movePageWords$1 = new MovePageWordsToKnownUseCase$movePageWords$1(this, continuationImpl);
        }
        Object objM7430i = movePageWordsToKnownUseCase$movePageWords$1.f29894b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = movePageWordsToKnownUseCase$movePageWords$1.f29896d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7430i);
            List list = ox7Var.f55132e;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((xz7) it.next()).f69008e);
            }
            movePageWordsToKnownUseCase$movePageWords$1.f29893a = str2;
            movePageWordsToKnownUseCase$movePageWords$1.f29896d = 1;
            objM7430i = ((C1310z) this.f29911a).m7430i(str, i, arrayList, movePageWordsToKnownUseCase$movePageWords$1);
            if (objM7430i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = movePageWordsToKnownUseCase$movePageWords$1.f29893a;
            AbstractC3193b.m15359b(objM7430i);
        }
        int iIntValue = ((Number) objM7430i).intValue();
        if (iIntValue > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("paging type", str2);
            bundle.putInt("n words to known", iIntValue);
            ((C1240a) this.f29912b).m7025f("Word(s) paged to known", bundle);
        }
        return new Integer(iIntValue);
    }
}
