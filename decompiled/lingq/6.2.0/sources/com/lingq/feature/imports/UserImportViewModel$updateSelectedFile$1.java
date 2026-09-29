package com.lingq.feature.imports;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bt2;
import p000.c32;
import p000.cma;
import p000.f5d;
import p000.ika;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$updateSelectedFile$1", m4291f = "UserImportViewModel.kt", m4292l = {382}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$updateSelectedFile$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2109f f26143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ContentResolver f26144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Uri f26145d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f26146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$updateSelectedFile$1(C2109f c2109f, ContentResolver contentResolver, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.f26143b = c2109f;
        this.f26144c = contentResolver;
        this.f26145d = uri;
        this.f26146e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$updateSelectedFile$1(this.f26143b, this.f26144c, this.f26145d, this.f26146e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$updateSelectedFile$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        long j;
        Object objM15542u;
        Object value2;
        Object value3;
        Object value4;
        Integer num;
        String str;
        C2109f c2109f = this.f26143b;
        C3244l c3244l = c2109f.f26185q;
        C3244l c3244l2 = c2109f.f26186r;
        cma cmaVar = c2109f.f26171c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26142a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, new Pair(new Integer(0), "")));
            ContentResolver contentResolver = this.f26144c;
            Cursor cursorQuery = contentResolver.query(this.f26145d, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_size");
                    j = (!cursorQuery.moveToFirst() || columnIndex == -1) ? 0L : cursorQuery.getLong(columnIndex);
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3584sr.m21646y(cursorQuery, th);
                        throw th2;
                    }
                }
            } else {
                j = 0;
            }
            if (j == 0) {
                do {
                    value3 = c3244l.getValue();
                } while (!c3244l.m15570h(value3, new bt2("Unknown file size. Kindly select a different file")));
            } else if (j > 209715200) {
                long j2 = j / 1048576;
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, new bt2("File size exceeds the maximum allowed limit of 200 MB. The size of the file you want to upload is " + j2 + "MB.")));
            } else {
                ika ikaVar = (ika) c2109f.f26170b.mo9014u2().getValue();
                String str2 = this.f26146e;
                ika ikaVarM13999a = ika.m13999a(ikaVar, null, null, null, null, null, null, null, str2, null, 895);
                boolean zM11562d = f5d.m11562d(str2);
                Uri uri = this.f26145d;
                if (!zM11562d) {
                    c2109f.m9017X2(contentResolver, uri, ika.m13999a(ikaVarM13999a, null, null, null, null, "File", null, null, null, null, 1007));
                    return xfaVar;
                }
                if (!cmaVar.mo4593p0() && !cmaVar.mo4592m0() && !cmaVar.mo4590d0()) {
                    c2109f.mo3737M1(UpgradeReason.TRANSCRIBE);
                    return xfaVar;
                }
                if (!cmaVar.mo4586T0()) {
                    c2109f.m9017X2(contentResolver, uri, ika.m13999a(ikaVarM13999a, null, null, null, null, "File", null, null, null, null, 1007));
                    return xfaVar;
                }
                if (!cmaVar.mo4588a0() && !cmaVar.mo4592m0() && !cmaVar.mo4590d0()) {
                    c2109f.mo3737M1(UpgradeReason.TRANSCRIBE_PLUS);
                    return xfaVar;
                }
                qm7 qm7Var = ((C1369b) c2109f.f26175g).f18480m;
                this.f26142a = 1;
                objM15542u = AbstractC3224d.m15542u(qm7Var, this);
                if (objM15542u == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        objM15542u = obj;
        Profile profile = (Profile) objM15542u;
        if (profile != null) {
            do {
                value4 = c3244l2.getValue();
                num = new Integer(profile.f19673v);
                str = profile.f19672u;
            } while (!c3244l2.m15570h(value4, new Pair(num, str != null ? y02.m24807e(str, "yyyy-MM-dd", "MMM dd") : "")));
        }
        return xfaVar;
    }
}
