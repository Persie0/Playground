package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.pointer.PointerEventPass;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m19206f = "DragGestureDetector.kt", m19207l = {235, 236, 241}, m19208m = "invokeSuspend")
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: c */
    public int f2019c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2020d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2052l<C8941c, C9072e> f2021e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2041a<C9072e> f2022f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2041a<C9072e> f2023g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2056p<C5028o, C8941c, C9072e> f2024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(InterfaceC2052l<? super C8941c, C9072e> interfaceC2052l, InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC2041a<C9072e> interfaceC2041a2, InterfaceC2056p<? super C5028o, ? super C8941c, C9072e> interfaceC2056p, InterfaceC9968c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2021e = interfaceC2052l;
        this.f2022f = interfaceC2041a;
        this.f2023g = interfaceC2041a2;
        this.f2024h = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f2021e, this.f2022f, this.f2023g, this.f2024h, interfaceC9968c);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f2020d = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:9:0x001b, B:36:0x0095, B:38:0x009e, B:40:0x00ae, B:42:0x00c1, B:44:0x00c6, B:51:0x00d2, B:52:0x00d6, B:53:0x00d9, B:54:0x00df, B:15:0x0032, B:29:0x0067, B:31:0x006b, B:18:0x003a, B:26:0x0055, B:21:0x0047), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:9:0x001b, B:36:0x0095, B:38:0x009e, B:40:0x00ae, B:42:0x00c1, B:44:0x00c6, B:51:0x00d2, B:52:0x00d6, B:53:0x00d9, B:54:0x00df, B:15:0x0032, B:29:0x0067, B:31:0x006b, B:18:0x003a, B:26:0x0055, B:21:0x0047), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:9:0x001b, B:36:0x0095, B:38:0x009e, B:40:0x00ae, B:42:0x00c1, B:44:0x00c6, B:51:0x00d2, B:52:0x00d6, B:53:0x00d9, B:54:0x00df, B:15:0x0032, B:29:0x0067, B:31:0x006b, B:18:0x003a, B:26:0x0055, B:21:0x0047), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:9:0x001b, B:36:0x0095, B:38:0x009e, B:40:0x00ae, B:42:0x00c1, B:44:0x00c6, B:51:0x00d2, B:52:0x00d6, B:53:0x00d9, B:54:0x00df, B:15:0x0032, B:29:0x0067, B:31:0x006b, B:18:0x003a, B:26:0x0055, B:21:0x0047), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00df A[Catch: CancellationException -> 0x00cd, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:9:0x001b, B:36:0x0095, B:38:0x009e, B:40:0x00ae, B:42:0x00c1, B:44:0x00c6, B:51:0x00d2, B:52:0x00d6, B:53:0x00d9, B:54:0x00df, B:15:0x0032, B:29:0x0067, B:31:0x006b, B:18:0x003a, B:26:0x0055, B:21:0x0047), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC5016c interfaceC5016c;
        C5028o c5028o;
        InterfaceC5016c interfaceC5016c2;
        List<C5028o> list;
        int size;
        int i10;
        C5028o c5028o2;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f2019c;
        InterfaceC2041a<C9072e> interfaceC2041a = this.f2023g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC5016c = (InterfaceC5016c) this.f2020d;
                    C7499b.m14977z0(obj);
                } else {
                    if (i11 == 2) {
                        interfaceC5016c = (InterfaceC5016c) this.f2020d;
                        C7499b.m14977z0(obj);
                        c5028o = (C5028o) obj;
                        if (c5028o != null) {
                            this.f2021e.mo528n(new C8941c(c5028o.f32837c));
                            long j10 = c5028o.f32835a;
                            final InterfaceC2056p<C5028o, C8941c, C9072e> interfaceC2056p = this.f2024h;
                            InterfaceC2052l<C5028o, C9072e> interfaceC2052l = new InterfaceC2052l<C5028o, C9072e>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C5028o c5028o3) {
                                    C5028o c5028o4 = c5028o3;
                                    C5207g.m11111f(c5028o4, "it");
                                    interfaceC2056p.mo1337m0(c5028o4, new C8941c(C8573r0.m16696R0(c5028o4, false)));
                                    c5028o4.m10713a();
                                    return C9072e.f47360a;
                                }
                            };
                            this.f2020d = interfaceC5016c;
                            this.f2019c = 3;
                            obj = DragGestureDetectorKt.m1446d(interfaceC5016c, j10, interfaceC2052l, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            interfaceC5016c2 = interfaceC5016c;
                        }
                        return C9072e.f47360a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5016c2 = (InterfaceC5016c) this.f2020d;
                    C7499b.m14977z0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    list = interfaceC5016c2.mo2027I().f32832a;
                    size = list.size();
                    for (i10 = 0; i10 < size; i10++) {
                        c5028o2 = list.get(i10);
                        C5207g.m11111f(c5028o2, "<this>");
                        if (c5028o2.m10714b() && c5028o2.f32841g && !c5028o2.f32838d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            c5028o2.m10713a();
                        }
                    }
                    this.f2022f.mo807E();
                } else {
                    interfaceC2041a.mo807E();
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            interfaceC5016c = (InterfaceC5016c) this.f2020d;
            this.f2020d = interfaceC5016c;
            this.f2019c = 1;
            obj = TapGestureDetectorKt.m1484a(interfaceC5016c, (2 & 1) != 0, (2 & 2) != 0 ? PointerEventPass.Main : null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            long j11 = ((C5028o) obj).f32835a;
            this.f2020d = interfaceC5016c;
            this.f2019c = 2;
            obj = DragGestureDetectorKt.m1444b(interfaceC5016c, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c5028o = (C5028o) obj;
            if (c5028o != null) {
                this.f2021e.mo528n(new C8941c(c5028o.f32837c));
                long j12 = c5028o.f32835a;
                final InterfaceC2056p<? super C5028o, ? super C8941c, C9072e> interfaceC2056p2 = this.f2024h;
                InterfaceC2052l<C5028o, C9072e> interfaceC2052l2 = new InterfaceC2052l<C5028o, C9072e>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C5028o c5028o3) {
                        C5028o c5028o4 = c5028o3;
                        C5207g.m11111f(c5028o4, "it");
                        interfaceC2056p2.mo1337m0(c5028o4, new C8941c(C8573r0.m16696R0(c5028o4, false)));
                        c5028o4.m10713a();
                        return C9072e.f47360a;
                    }
                };
                this.f2020d = interfaceC5016c;
                this.f2019c = 3;
                obj = DragGestureDetectorKt.m1446d(interfaceC5016c, j12, interfaceC2052l2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5016c2 = interfaceC5016c;
                if (((Boolean) obj).booleanValue()) {
                    list = interfaceC5016c2.mo2027I().f32832a;
                    size = list.size();
                    while (i10 < size) {
                        c5028o2 = list.get(i10);
                        C5207g.m11111f(c5028o2, "<this>");
                        if (c5028o2.m10714b()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            c5028o2.m10713a();
                        }
                    }
                    this.f2022f.mo807E();
                } else {
                    interfaceC2041a.mo807E();
                }
            }
            return C9072e.f47360a;
        } catch (CancellationException e10) {
            interfaceC2041a.mo807E();
            throw e10;
        }
    }
}
