package com.lingq.feature.reader.old;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.player.data.PlayingSource;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.tb7;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setupPlayerForLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2173, 2194}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setupPlayerForLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lesson f29054c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f29055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setupPlayerForLesson$1(C2412n c2412n, Lesson lesson, String str, Continuation continuation) {
        super(2, continuation);
        this.f29053b = c2412n;
        this.f29054c = lesson;
        this.f29055d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setupPlayerForLesson$1(this.f29053b, this.f29054c, this.f29055d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$setupPlayerForLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r3.f29352e.mo8234r(r1, r22) == r5) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM9315X2;
        Lesson lesson = this.f29054c;
        int i = lesson.f19142a;
        C2412n c2412n = this.f29053b;
        cma cmaVar = c2412n.f29340b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f29052a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29052a = 1;
            objM9315X2 = C2412n.m9315X2(c2412n, i, this);
            if (objM9315X2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            objM9315X2 = obj;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        boolean zBooleanValue = ((Boolean) objM9315X2).booleanValue();
        int i3 = lesson.f19142a;
        String str = lesson.f19143b;
        String str2 = lesson.f19159r;
        String str3 = str2 == null ? "" : str2;
        String str4 = lesson.f19150i;
        String str5 = str4 == null ? "" : str4;
        int i4 = lesson.f19148g * DescriptorProtos.Edition.EDITION_2023_VALUE;
        String str6 = lesson.f19146e;
        String str7 = str6 == null ? "" : str6;
        int i5 = lesson.f19149h;
        PlayingSource playingSource = PlayingSource.Reader;
        String strMo4589b2 = cmaVar.mo4589b2();
        String str8 = this.f29055d;
        tb7 tb7Var = new tb7(i3, str8, str, str3, str5, i4, str7, zBooleanValue, i5, strMo4589b2, playingSource, null, 14336);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tb7Var);
        c2412n.f29289K.m8461a0(arrayList);
        if (!vk9.m23391n0(str8) && !zBooleanValue) {
            DownloadItem downloadItem = new DownloadItem(cmaVar.mo4589b2(), i, str8);
            this.f29052a = 2;
        }
        return xfa.f68157a;
    }
}
