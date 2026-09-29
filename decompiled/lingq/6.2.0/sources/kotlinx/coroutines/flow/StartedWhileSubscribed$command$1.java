package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m4291f = "SharingStarted.kt", m4292l = {175, 177, 179, 180, 182}, m4293m = "invokeSuspend", m4294v = 1)
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f48032a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f48033b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f48034c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3243k f48035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(C3243k c3243k, Continuation continuation) {
        super(3, continuation);
        this.f48035d = c3243k;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f48035d, (Continuation) obj3);
        startedWhileSubscribed$command$1.f48033b = (e83) obj;
        startedWhileSubscribed$command$1.f48034c = iIntValue;
        return startedWhileSubscribed$command$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SharingCommand sharingCommand;
        C3243k c3243k = this.f48035d;
        long j = c3243k.f48153b;
        e83 e83Var = this.f48033b;
        int i = this.f48034c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f48032a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (i > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.f48033b = null;
                this.f48034c = i;
                this.f48032a = 1;
            } else {
                long j2 = c3243k.f48152a;
                this.f48033b = e83Var;
                this.f48034c = i;
                this.f48032a = 2;
                if (AbstractC3208a.m15437d(j2, this) != coroutineSingletons) {
                    if (j > 0) {
                        sharingCommand = SharingCommand.STOP;
                        this.f48033b = e83Var;
                        this.f48034c = i;
                        this.f48032a = 3;
                        if (e83Var.emit(sharingCommand, this) != coroutineSingletons) {
                            this.f48033b = e83Var;
                            this.f48034c = i;
                            this.f48032a = 4;
                            if (AbstractC3208a.m15437d(j, this) != coroutineSingletons) {
                                SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                                this.f48033b = null;
                                this.f48034c = i;
                                this.f48032a = 5;
                            }
                        }
                    } else {
                        SharingCommand sharingCommand4 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                        this.f48033b = null;
                        this.f48034c = i;
                        this.f48032a = 5;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                if (j > 0) {
                    sharingCommand = SharingCommand.STOP;
                    this.f48033b = e83Var;
                    this.f48034c = i;
                    this.f48032a = 3;
                    if (e83Var.emit(sharingCommand, this) != coroutineSingletons) {
                        this.f48033b = e83Var;
                        this.f48034c = i;
                        this.f48032a = 4;
                        if (AbstractC3208a.m15437d(j, this) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                AbstractC3193b.m15359b(obj);
                this.f48033b = e83Var;
                this.f48034c = i;
                this.f48032a = 4;
                if (AbstractC3208a.m15437d(j, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                AbstractC3193b.m15359b(obj);
            } else if (i2 != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SharingCommand sharingCommand5 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
            this.f48033b = null;
            this.f48034c = i;
            this.f48032a = 5;
        }
        AbstractC3193b.m15359b(obj);
        return xfa.f68157a;
    }
}
