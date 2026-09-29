package p000;

import androidx.glance.appwidget.proto.LayoutProto$ContentScale;
import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.glance.appwidget.proto.LayoutProto$LayoutType;
import androidx.glance.appwidget.proto.LayoutProto$NodeIdentity;
import androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment;

/* JADX INFO: loaded from: classes2.dex */
public final class pr4 implements h94 {

    /* JADX INFO: renamed from: b */
    public static final pr4 f56719b = new pr4(0);

    /* JADX INFO: renamed from: c */
    public static final pr4 f56720c = new pr4(1);

    /* JADX INFO: renamed from: d */
    public static final pr4 f56721d = new pr4(2);

    /* JADX INFO: renamed from: e */
    public static final pr4 f56722e = new pr4(3);

    /* JADX INFO: renamed from: f */
    public static final pr4 f56723f = new pr4(4);

    /* JADX INFO: renamed from: g */
    public static final pr4 f56724g = new pr4(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56725a;

    public /* synthetic */ pr4(int i) {
        this.f56725a = i;
    }

    @Override // p000.h94
    public final boolean isInRange(int i) {
        switch (this.f56725a) {
            case 0:
                return LayoutProto$ContentScale.forNumber(i) != null;
            case 1:
                return LayoutProto$DimensionType.forNumber(i) != null;
            case 2:
                return LayoutProto$HorizontalAlignment.forNumber(i) != null;
            case 3:
                return LayoutProto$LayoutType.forNumber(i) != null;
            case 4:
                return LayoutProto$NodeIdentity.forNumber(i) != null;
            default:
                return LayoutProto$VerticalAlignment.forNumber(i) != null;
        }
    }
}
