package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.lifecycle.Lifecycle$Event;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.tasks.Task;
import com.google.common.base.AbstractC1083c;
import com.google.common.hash.AbstractC1108b;
import com.google.common.hash.C1109c;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.AbstractC1250j;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.reader.old.ReaderPageFragment;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class mq7 implements lr9, fm1, wm9, tr6, zr2, a58, txc, idc {

    /* JADX INFO: renamed from: e */
    public static mq7 f51731e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51732a;

    /* JADX INFO: renamed from: b */
    public Object f51733b;

    /* JADX INFO: renamed from: c */
    public Object f51734c;

    /* JADX INFO: renamed from: d */
    public Object f51735d;

    public mq7(int i) {
        this.f51732a = i;
        switch (i) {
            case 10:
                this.f51733b = new HashMap();
                this.f51734c = new HashMap();
                this.f51735d = rlb.f59510c;
                break;
            case 11:
                this.f51733b = new HashMap();
                this.f51734c = new HashMap();
                this.f51735d = rlb.f59514g;
                break;
            default:
                this.f51733b = new ofb("", 0L, null);
                this.f51734c = new ofb("", 0L, null);
                this.f51735d = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static mq7 m16997a(Context context) {
        if (f51731e == null) {
            Context applicationContext = context.getApplicationContext();
            f51731e = new mq7(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f51731e;
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        suc sucVar = (suc) ((yuc) obj).m11611l();
        lrc lrcVar = new lrc((ltc) this.f51733b, (wo3) this.f51735d);
        String str = (String) this.f51734c;
        Parcel parcelM16773J = sucVar.m16773J();
        parcelM16773J.writeString(str);
        bqb.m4107d(parcelM16773J, lrcVar);
        sucVar.m16776M(parcelM16773J, 28);
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: b */
    public int mo4446b(long j) {
        long[] jArr = (long[]) this.f51735d;
        int iM22806a = uma.m22806a(jArr, j, false);
        if (iM22806a < jArr.length) {
            return iM22806a;
        }
        return -1;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: c */
    public long mo4447c(int i) {
        long[] jArr = (long[]) this.f51735d;
        bna.m3969q(i >= 0);
        bna.m3969q(i < jArr.length);
        return jArr[i];
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f51732a) {
            case 8:
                mq7 mq7Var = new mq7(((ofb) this.f51733b).clone());
                Iterator it = ((ArrayList) this.f51735d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) mq7Var.f51735d).add(((ofb) it.next()).clone());
                }
                return mq7Var;
            default:
                return super.clone();
        }
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        cc4 cc4Var = (cc4) this.f51735d;
        xv5 xv5Var = (xv5) this.f51733b;
        String strM10322b = ((df4) cc4Var.f9881a).m10322b((KSerializer) this.f51734c, obj);
        int i = z68.f70989a;
        return hpc.m13428a(strM10322b, xv5Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r11
      0x0033: PHI (r11v9 int) = (r11v1 int), (r11v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // p000.txc
    /* JADX INFO: renamed from: d */
    public void mo16998d(int i, Throwable th, byte[] bArr) {
        zzlr zzlrVar;
        C1043b c1043b = (C1043b) this.f51733b;
        c1043b.mo12359D();
        zzom zzomVar = (zzom) this.f51735d;
        if (i == 200 || i == 204) {
            if (th == null) {
                xcc xccVar = ((kjc) c1043b.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17924b(Long.valueOf(zzomVar.f12397a), "[sgtm] Upload succeeded for row_id");
                zzlrVar = zzlr.SUCCESS;
            } else {
                xcc xccVar2 = ((kjc) c1043b.f60774a).f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68083i.m17926d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f12397a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) z8c.f71203u.m21901a(null)).split(",")).contains(String.valueOf(i))) {
                    zzlrVar = zzlr.BACKOFF;
                } else {
                    zzlrVar = zzlr.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                xcc xccVar3 = ((kjc) c1043b.f60774a).f47438f;
                kjc.m15280l(xccVar3);
                xccVar3.f68076I.m17924b(Long.valueOf(zzomVar.f12397a), "[sgtm] Upload succeeded for row_id");
                zzlrVar = zzlr.SUCCESS;
            } else {
                xcc xccVar4 = ((kjc) c1043b.f60774a).f47438f;
                kjc.m15280l(xccVar4);
                xccVar4.f68083i.m17926d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f12397a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) z8c.f71203u.m21901a(null)).split(",")).contains(String.valueOf(i))) {
                    zzlrVar = zzlr.BACKOFF;
                } else {
                    zzlrVar = zzlr.FAILURE;
                }
            }
        } else {
            xcc xccVar5 = ((kjc) c1043b.f60774a).f47438f;
            kjc.m15280l(xccVar5);
            xccVar5.f68083i.m17926d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f12397a), Integer.valueOf(i), th);
            if (Arrays.asList(((String) z8c.f71203u.m21901a(null)).split(",")).contains(String.valueOf(i))) {
                zzlrVar = zzlr.BACKOFF;
            } else {
                zzlrVar = zzlr.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.f51734c;
        v4d v4dVarM15287o = ((kjc) c1043b.f60774a).m15287o();
        long j = zzomVar.f12397a;
        zzaf zzafVar = new zzaf(zzlrVar.zza(), j, zzomVar.f12402f);
        v4dVarM15287o.mo12359D();
        v4dVarM15287o.m13744E();
        v4dVarM15287o.m23117R(new kr3(10, v4dVarM15287o, v4dVarM15287o.m23119T(true), zzafVar, false));
        xcc xccVar6 = ((kjc) c1043b.f60774a).f47438f;
        kjc.m15280l(xccVar6);
        xccVar6.f68076I.m17925c("[sgtm] Updated status for row_id", Long.valueOf(j), zzlrVar);
        synchronized (atomicReference) {
            atomicReference.set(zzlrVar);
            atomicReference.notifyAll();
        }
    }

    @Override // p000.zr2
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ zr2 mo12901e(Class cls, fp6 fp6Var) {
        switch (this.f51732a) {
            case 10:
                ((HashMap) this.f51733b).put(cls, fp6Var);
                ((HashMap) this.f51734c).remove(cls);
                break;
            default:
                ((HashMap) this.f51733b).put(cls, fp6Var);
                ((HashMap) this.f51734c).remove(cls);
                break;
        }
        return this;
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        wj8 wj8Var = (wj8) this.f51733b;
        String str = (String) this.f51734c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f51735d;
        synchronized (wj8Var.f66937a) {
            wj8Var.f66937a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX INFO: renamed from: g */
    public void m16999g(Activity activity, q6b q6bVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f51735d;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f51734c;
        reentrantLock.lock();
        try {
            if (q6bVar.equals((q6b) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((a79) ((vqb) this.f51733b).f65802b).f329b.iterator();
            it.getClass();
            while (it.hasNext()) {
                z69 z69Var = (z69) it.next();
                if (z69Var.f70990a.equals(activity)) {
                    z69Var.f70992c = q6bVar;
                    z69Var.f70991b.accept(q6bVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0052 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[Catch: all -> 0x001e, PHI: r6
      0x0065: PHI (r6v7 int) = (r6v1 int), (r6v0 int) binds: [B:12:0x002a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.idc
    /* JADX INFO: renamed from: h */
    public void mo12445h(String str, int i, Throwable th, byte[] bArr, Map map) {
        ydc ydcVar;
        nnb nnbVar;
        String strSubstring;
        Object obj;
        long j = ((aad) this.f51734c).f431a;
        C1045d c1045d = (C1045d) this.f51735d;
        String str2 = (String) this.f51733b;
        c1045d.mo5913d().mo12359D();
        c1045d.m5930l0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                c1045d.f12345P = false;
                c1045d.m5898O();
            }
        }
        if (i == 200) {
            if (th == null) {
                nnb nnbVar2 = c1045d.f12360c;
                C1045d.m5885T(nnbVar2);
                nnbVar2.m17522K(Long.valueOf(j));
                c1045d.mo5909b().f68076I.m17925c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                ydcVar = c1045d.f12358b;
                C1045d.m5885T(ydcVar);
                if (ydcVar.m25102H()) {
                    nnbVar = c1045d.f12360c;
                    C1045d.m5885T(nnbVar);
                    if (nnbVar.m17520J(str2)) {
                        c1045d.m5943t(str2);
                    } else {
                        c1045d.m5897N();
                    }
                } else {
                    c1045d.m5897N();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                occ occVar = c1045d.mo5909b().f68085k;
                Integer numValueOf = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                occVar.m17926d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                nnb nnbVar3 = c1045d.f12360c;
                C1045d.m5885T(nnbVar3);
                nnbVar3.m17530P(Long.valueOf(j));
                c1045d.m5897N();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                nnb nnbVar4 = c1045d.f12360c;
                C1045d.m5885T(nnbVar4);
                nnbVar4.m17522K(Long.valueOf(j));
                c1045d.mo5909b().f68076I.m17925c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                ydcVar = c1045d.f12358b;
                C1045d.m5885T(ydcVar);
                if (ydcVar.m25102H()) {
                    nnbVar = c1045d.f12360c;
                    C1045d.m5885T(nnbVar);
                    if (nnbVar.m17520J(str2)) {
                        c1045d.m5943t(str2);
                    } else {
                        c1045d.m5897N();
                    }
                } else {
                    c1045d.m5897N();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                occ occVar2 = c1045d.mo5909b().f68085k;
                Integer numValueOf2 = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                occVar2.m17926d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                nnb nnbVar5 = c1045d.f12360c;
                C1045d.m5885T(nnbVar5);
                nnbVar5.m17530P(Long.valueOf(j));
                c1045d.m5897N();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            occ occVar3 = c1045d.mo5909b().f68085k;
            Integer numValueOf3 = Integer.valueOf(i);
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            occVar3.m17926d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            nnb nnbVar6 = c1045d.f12360c;
            C1045d.m5885T(nnbVar6);
            nnbVar6.m17530P(Long.valueOf(j));
            c1045d.m5897N();
        }
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: i */
    public List mo4453i(long j) {
        List list = (List) this.f51733b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f51734c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                u3b u3bVar = (u3b) list.get(i);
                cs1 cs1Var = u3bVar.f63364a;
                if (cs1Var.f34468e == -3.4028235E38f) {
                    arrayList2.add(u3bVar);
                } else {
                    arrayList.add(cs1Var);
                }
            }
        }
        Collections.sort(arrayList2, new C3166k(16));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            bs1 bs1VarM9869a = ((u3b) arrayList2.get(i3)).f63364a.m9869a();
            bs1VarM9869a.f8917e = (-1) - i3;
            bs1VarM9869a.f8918f = 1;
            arrayList.add(bs1VarM9869a.m4153a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m17000j(Lifecycle$Event lifecycle$Event) {
        my8 my8Var = (my8) this.f51735d;
        if (my8Var != null) {
            my8Var.run();
        }
        my8 my8Var2 = new my8((wb5) this.f51733b, lifecycle$Event);
        this.f51735d = my8Var2;
        ((Handler) this.f51734c).postAtFrontOfQueue(my8Var2);
    }

    /* JADX INFO: renamed from: k */
    public void m17001k(zic zicVar) {
        String str;
        String str2;
        C3509qs c3509qs = (C3509qs) this.f51735d;
        y15 y15Var = (y15) this.f51734c;
        boolean z = true;
        hm5 hm5Var = (hm5) this.f51733b;
        if (zicVar instanceof tt7) {
            tt7 tt7Var = (tt7) zicVar;
            boolean z2 = tt7Var.f62865f;
            LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = tt7Var.f62864e;
            Lesson lesson = tt7Var.f62862c;
            if (z2) {
                Bundle bundle = new Bundle();
                bundle.putInt("Lesson ID", lesson.f19142a);
                ((C1240a) hm5Var).m7025f("Sentence mode opened", bundle);
                return;
            }
            int i = c3509qs.f58118b.getInt("lessonsOpened", 0) + 1;
            SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
            editorEdit.getClass();
            editorEdit.putInt("lessonsOpened", i);
            editorEdit.apply();
            String str3 = lesson.f19140J;
            LessonMetadata lessonMetadata = lesson.f19139I;
            if (!cl9.m4834Q(str3, "private", true) && !cl9.m4834Q(lesson.f19140J, "D", true)) {
                z = false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Lesson ID", lesson.f19142a);
            bundle2.putString("Lesson language", AbstractC3184kh.m15223q(tt7Var.f62863d));
            bundle2.putString("Lesson name", lesson.f19143b);
            bundle2.putString("Lesson level", lesson.f19159r);
            List list = lesson.f19133C;
            bundle2.putString("Tags", list != null ? u91.m22596N0(list, null, null, null, null, 63) : null);
            bundle2.putString("Shared By", lesson.f19164w);
            bundle2.putString("Course name", lesson.f19150i);
            bundle2.putInt("Course ID", lesson.f19149h);
            bundle2.putString("Lesson Open Path 1", AbstractC1250j.m7032a(lqAnalyticsValues$LessonPath));
            bundle2.putString("Lesson Open Path 2", AbstractC1250j.m7033b(lqAnalyticsValues$LessonPath));
            if (lessonMetadata != null && (str2 = lessonMetadata.f19234a) != null) {
                bundle2.putString("original lesson name", str2);
            }
            if (lessonMetadata != null && (str = lessonMetadata.f19235b) != null) {
                bundle2.putString("Import Method", str);
            }
            bundle2.putBoolean("imported by user", z);
            ((C1240a) hm5Var).m7025f("Lesson opened", bundle2);
            return;
        }
        if (zicVar instanceof au7) {
            if (((au7) zicVar).f7520c) {
                y15Var.mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
                return;
            }
            y15Var.mo49u1(LessonEngagedDataType.BlueWordsClicked, 1);
            if (c3509qs.f58118b.getBoolean("blueWordClicked", false)) {
                return;
            }
            ((C1240a) hm5Var).m7025f("Blue word clicked", new Bundle());
            SharedPreferences.Editor editorEdit2 = c3509qs.f58118b.edit();
            editorEdit2.getClass();
            editorEdit2.putBoolean("blueWordClicked", true);
            editorEdit2.apply();
            return;
        }
        if (zicVar instanceof qt7) {
            int i2 = ((qt7) zicVar).f58190c;
            if (i2 == CardStatus.Known.getValue()) {
                y15Var.mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
                return;
            } else if (i2 != CardStatus.Learned.getValue()) {
                y15Var.mo49u1(LessonEngagedDataType.LingqsClicked, 1);
                return;
            } else {
                y15Var.mo49u1(LessonEngagedDataType.LingqsClicked, 1);
                y15Var.mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
                return;
            }
        }
        if (zicVar instanceof ut7) {
            ut7 ut7Var = (ut7) zicVar;
            if (c3509qs.f58118b.getBoolean("didPageAdvanced", false)) {
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("Lesson ID", ut7Var.f64335c);
            bundle3.putString("sentence or page", ut7Var.f64336d ? "sentence" : "page");
            ((C1240a) hm5Var).m7025f("Page advanced", bundle3);
            SharedPreferences.Editor editorEdit3 = c3509qs.f58118b.edit();
            editorEdit3.getClass();
            editorEdit3.putBoolean("didPageAdvanced", true);
            editorEdit3.apply();
            return;
        }
        if (zicVar instanceof yt7) {
            C1240a c1240a = (C1240a) hm5Var;
            c1240a.m7025f("Reader setting changed", c1240a.m7022c(null, null));
            throw null;
        }
        if (zicVar instanceof zt7) {
            y15Var.mo49u1(LessonEngagedDataType.WordCount, Integer.valueOf(((zt7) zicVar).f72152c));
            return;
        }
        if (zicVar instanceof rt7) {
            y15Var.mo49u1(LessonEngagedDataType.CoinsEarned, Integer.valueOf(((rt7) zicVar).f59798c));
            return;
        }
        if (zicVar instanceof st7) {
            ((C1240a) hm5Var).m7025f("Lesson audio generated", null);
            return;
        }
        if (zicVar instanceof vt7) {
            ((C1240a) hm5Var).m7025f("Sentence audio played", null);
            return;
        }
        if (zicVar instanceof xt7) {
            ((C1240a) hm5Var).m7025f("Sentence translation viewed", g9a.m12429f("translation location", "sentence mode"));
        } else if (zicVar instanceof wt7) {
            ((C1240a) hm5Var).m7025f("Viewed Sentence Notes", null);
        } else {
            gm5.m12750e();
        }
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: l */
    public int mo4454l() {
        return ((long[]) this.f51735d).length;
    }

    /* JADX INFO: renamed from: m */
    public File m17002m() {
        String str = (String) ((on9) this.f51734c).get();
        String str2 = (String) ((on9) this.f51735d).get();
        return new File(wq1.m24125u(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    /* JADX INFO: renamed from: n */
    public ofb m17003n() {
        return (ofb) this.f51733b;
    }

    /* JADX INFO: renamed from: o */
    public void m17004o(ofb ofbVar) {
        this.f51733b = ofbVar;
        this.f51734c = ofbVar.clone();
        ((ArrayList) this.f51735d).clear();
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: p */
    public void mo11812p(Drawable drawable) {
        dr5 dr5Var = (dr5) this.f51735d;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            ((SpannableString) this.f51733b).setSpan(new ImageSpan(((ReaderPageFragment) this.f51734c).m2090R(), bitmap, 0), dr5Var.m10611b().f40379a, dr5Var.m10611b().f40380b + 1, 33);
        }
    }

    /* JADX INFO: renamed from: q */
    public ofb m17005q() {
        return (ofb) this.f51734c;
    }

    /* JADX INFO: renamed from: r */
    public List m17006r() {
        return (ArrayList) this.f51735d;
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: s */
    public void mo11813s(Drawable drawable) {
    }

    public String toString() {
        switch (this.f51732a) {
            case 12:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f51733b);
                sb.append('{');
                cdb cdbVar = (cdb) ((cdb) this.f51734c).f9946c;
                String str = "";
                while (cdbVar != null) {
                    Object obj = cdbVar.f9945b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cdbVar = (cdb) cdbVar.f9946c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: u */
    public void mo11814u(Drawable drawable) {
    }

    public /* synthetic */ mq7(Object obj, Object obj2, Object obj3, int i) {
        this.f51732a = i;
        this.f51733b = obj;
        this.f51734c = obj2;
        this.f51735d = obj3;
    }

    public /* synthetic */ mq7(int i, boolean z) {
        this.f51732a = i;
    }

    public mq7(final zzacr zzacrVar, final String str) {
        this.f51732a = 18;
        this.f51733b = a90.f371d;
        final int i = 1;
        this.f51734c = AbstractC1083c.m6269a(new on9(this) { // from class: g3d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ mq7 f40153b;

            {
                this.f40153b = this;
            }

            @Override // p000.on9
            public final Object get() {
                int i2 = i;
                Serializable serializable = zzacrVar;
                mq7 mq7Var = this.f40153b;
                switch (i2) {
                    case 0:
                        C1109c c1109cM6360d = AbstractC1108b.m6356a().mo6355b().m6360d(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c1109cM6360d.f13488a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c1109cM6360d.m6358b();
                        }
                        return ((z80) mq7Var.f51733b).m183a(c1109cM6360d.m6360d("".getBytes()).m6357a().mo6354a());
                    default:
                        return ((z80) mq7Var.f51733b).m183a(((zzacr) serializable).m5434n());
                }
            }
        });
        final int i2 = 0;
        this.f51735d = AbstractC1083c.m6269a(new on9(this) { // from class: g3d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ mq7 f40153b;

            {
                this.f40153b = this;
            }

            @Override // p000.on9
            public final Object get() {
                int i3 = i2;
                Serializable serializable = str;
                mq7 mq7Var = this.f40153b;
                switch (i3) {
                    case 0:
                        C1109c c1109cM6360d = AbstractC1108b.m6356a().mo6355b().m6360d(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c1109cM6360d.f13488a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c1109cM6360d.m6358b();
                        }
                        return ((z80) mq7Var.f51733b).m183a(c1109cM6360d.m6360d("".getBytes()).m6357a().mo6354a());
                    default:
                        return ((z80) mq7Var.f51733b).m183a(((zzacr) serializable).m5434n());
                }
            }
        });
    }

    public mq7(C1045d c1045d, String str, aad aadVar) {
        this.f51732a = 19;
        this.f51733b = str;
        this.f51734c = aadVar;
        this.f51735d = c1045d;
    }

    public mq7(String str) {
        this.f51732a = 12;
        cdb cdbVar = new cdb(8, false);
        this.f51734c = cdbVar;
        this.f51735d = cdbVar;
        this.f51733b = str;
    }

    public mq7(ofb ofbVar) {
        this.f51732a = 8;
        this.f51733b = ofbVar;
        this.f51734c = ofbVar.clone();
        this.f51735d = new ArrayList();
    }

    public mq7(hm5 hm5Var, y15 y15Var, C3509qs c3509qs, o23 o23Var, un1 un1Var) {
        this.f51732a = 1;
        hm5Var.getClass();
        y15Var.getClass();
        c3509qs.getClass();
        un1Var.getClass();
        this.f51733b = hm5Var;
        this.f51734c = y15Var;
        this.f51735d = c3509qs;
    }

    public mq7(SystemForegroundService systemForegroundService) {
        this.f51732a = 4;
        this.f51733b = new wb5(systemForegroundService, true);
        this.f51734c = new Handler(Looper.getMainLooper());
    }

    public mq7(ArrayList arrayList) {
        this.f51732a = 7;
        this.f51733b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f51734c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            u3b u3bVar = (u3b) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f51734c;
            jArr[i2] = u3bVar.f63365b;
            jArr[i2 + 1] = u3bVar.f63366c;
        }
        long[] jArr2 = (long[]) this.f51734c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f51735d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public mq7(Context context, LocationManager locationManager) {
        this.f51732a = 6;
        this.f51735d = new gda();
        this.f51733b = context;
        this.f51734c = locationManager;
    }

    public mq7(vqb vqbVar) {
        this.f51732a = 5;
        this.f51733b = vqbVar;
        this.f51734c = new ReentrantLock();
        this.f51735d = new WeakHashMap();
    }
}
