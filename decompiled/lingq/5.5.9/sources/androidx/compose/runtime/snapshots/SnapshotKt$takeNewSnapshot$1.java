package androidx.compose.runtime.snapshots;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m13365d2 = {"Landroidx/compose/runtime/snapshots/b;", "T", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements InterfaceC2052l<SnapshotIdSet, Object> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2052l<SnapshotIdSet, Object> f3276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(InterfaceC2052l<? super SnapshotIdSet, Object> interfaceC2052l) {
        super(1);
        this.f3276b = interfaceC2052l;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        C5207g.m11111f(snapshotIdSet2, "invalid");
        AbstractC0497b abstractC0497b = (AbstractC0497b) this.f3276b.mo528n(snapshotIdSet2);
        synchronized (SnapshotKt.f3262c) {
            SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(abstractC0497b.mo1918d());
            C9072e c9072e = C9072e.f47360a;
        }
        return abstractC0497b;
    }
}
