package p000;

import androidx.glance.appwidget.proto.LayoutProto$ContentScale;
import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.glance.appwidget.proto.LayoutProto$LayoutType;
import androidx.glance.appwidget.proto.LayoutProto$NodeIdentity;
import androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment;
import androidx.glance.appwidget.protobuf.AbstractC0667a;
import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vr4 extends AbstractC0675i {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final vr4 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile r47 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private n94 children_ = ko7.f47602d;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        vr4 vr4Var = new vr4();
        DEFAULT_INSTANCE = vr4Var;
        AbstractC0675i.m2381k(vr4.class, vr4Var);
    }

    /* JADX INFO: renamed from: A */
    public static ur4 m23516A() {
        return (ur4) DEFAULT_INSTANCE.m2382c();
    }

    /* JADX INFO: renamed from: n */
    public static void m23517n(vr4 vr4Var, LayoutProto$LayoutType layoutProto$LayoutType) {
        vr4Var.getClass();
        vr4Var.type_ = layoutProto$LayoutType.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m23518o(vr4 vr4Var, LayoutProto$DimensionType layoutProto$DimensionType) {
        vr4Var.getClass();
        vr4Var.width_ = layoutProto$DimensionType.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m23519p(vr4 vr4Var, LayoutProto$DimensionType layoutProto$DimensionType) {
        vr4Var.getClass();
        vr4Var.height_ = layoutProto$DimensionType.getNumber();
    }

    /* JADX INFO: renamed from: q */
    public static void m23520q(vr4 vr4Var, LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
        vr4Var.getClass();
        vr4Var.horizontalAlignment_ = layoutProto$HorizontalAlignment.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static void m23521r(vr4 vr4Var, LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
        vr4Var.getClass();
        vr4Var.verticalAlignment_ = layoutProto$VerticalAlignment.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static void m23522s(vr4 vr4Var, LayoutProto$ContentScale layoutProto$ContentScale) {
        vr4Var.getClass();
        vr4Var.imageScale_ = layoutProto$ContentScale.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static void m23523t(vr4 vr4Var, LayoutProto$NodeIdentity layoutProto$NodeIdentity) {
        vr4Var.getClass();
        vr4Var.identity_ = layoutProto$NodeIdentity.getNumber();
    }

    /* JADX INFO: renamed from: u */
    public static void m23524u(vr4 vr4Var, boolean z) {
        vr4Var.hasAction_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m23525v(vr4 vr4Var, ArrayList arrayList) {
        n94 n94Var = vr4Var.children_;
        if (!((AbstractC3356n1) n94Var).f52152a) {
            int size = n94Var.size();
            vr4Var.children_ = n94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        AbstractC0667a.m2277a(arrayList, vr4Var.children_);
    }

    /* JADX INFO: renamed from: w */
    public static void m23526w(vr4 vr4Var, boolean z) {
        vr4Var.hasImageDescription_ = z;
    }

    /* JADX INFO: renamed from: x */
    public static void m23527x(vr4 vr4Var, boolean z) {
        vr4Var.hasImageColorFilter_ = z;
    }

    /* JADX INFO: renamed from: y */
    public static void m23528y(vr4 vr4Var, boolean z) {
        vr4Var.hasImageAlpha_ = z;
    }

    /* JADX INFO: renamed from: z */
    public static vr4 m23529z() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new vr4();
            case 2:
                return new ur4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", vr4.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (vr4.class) {
                    try {
                        yk3Var = PARSER;
                        if (yk3Var == null) {
                            yk3Var = new yk3();
                            PARSER = yk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return yk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }
}
