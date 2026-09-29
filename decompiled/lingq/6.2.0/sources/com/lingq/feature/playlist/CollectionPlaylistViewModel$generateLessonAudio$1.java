package com.lingq.feature.playlist;

import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$generateLessonAudio$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {324, 326, 328}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$generateLessonAudio$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$generateLessonAudio$1(C2251a c2251a, int i, Continuation continuation) {
        super(1, continuation);
        this.f27557b = c2251a;
        this.f27558c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionPlaylistViewModel$generateLessonAudio$1(this.f27557b, this.f27558c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionPlaylistViewModel$generateLessonAudio$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r6.f27776e.mo8234r(r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27556a;
        int i2 = this.f27558c;
        C2251a c2251a = this.f27557b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c2251a.m9206Y2();
            c83 c83VarMo4583O1 = c2251a.f27773b.mo4583O1();
            this.f27556a = 1;
            obj = AbstractC3224d.m15541t(c83VarMo4583O1, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
            str = (String) obj;
            if (str.length() > 0) {
                DownloadItem downloadItem = new DownloadItem(c2251a.f27773b.mo4589b2(), i2, str);
                this.f27556a = 3;
            }
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        ProfileAccount profileAccount = (ProfileAccount) obj;
        if (c2251a.f27773b.mo4598w2() || profileAccount.f19687k < 5) {
            C1381c c1381c = c2251a.f27782k;
            String strMo4589b2 = c2251a.f27773b.mo4589b2();
            this.f27556a = 2;
            obj = c1381c.m7991b(i2, strMo4589b2, this);
            if (obj != coroutineSingletons) {
                str = (String) obj;
                if (str.length() > 0) {
                    DownloadItem downloadItem2 = new DownloadItem(c2251a.f27773b.mo4589b2(), i2, str);
                    this.f27556a = 3;
                }
            }
            return coroutineSingletons;
        }
        c2251a.mo3737M1(UpgradeReason.GENERATE_TTS);
        return xfa.f68157a;
    }
}
