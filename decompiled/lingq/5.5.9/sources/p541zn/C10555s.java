package p541zn;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: zn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C10555s {

    /* JADX INFO: renamed from: zn.s$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52621a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f52622b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f52623c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f52624d;

        static {
            int[] iArr = new int[ProtoBuf$Modality.values().length];
            iArr[ProtoBuf$Modality.FINAL.ordinal()] = 1;
            iArr[ProtoBuf$Modality.OPEN.ordinal()] = 2;
            iArr[ProtoBuf$Modality.ABSTRACT.ordinal()] = 3;
            iArr[ProtoBuf$Modality.SEALED.ordinal()] = 4;
            f52621a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            iArr2[Modality.FINAL.ordinal()] = 1;
            iArr2[Modality.OPEN.ordinal()] = 2;
            iArr2[Modality.ABSTRACT.ordinal()] = 3;
            iArr2[Modality.SEALED.ordinal()] = 4;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            int[] iArr4 = new int[ProtoBuf$Class.Kind.values().length];
            iArr4[ProtoBuf$Class.Kind.CLASS.ordinal()] = 1;
            iArr4[ProtoBuf$Class.Kind.INTERFACE.ordinal()] = 2;
            iArr4[ProtoBuf$Class.Kind.ENUM_CLASS.ordinal()] = 3;
            iArr4[ProtoBuf$Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            iArr4[ProtoBuf$Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[ProtoBuf$Class.Kind.OBJECT.ordinal()] = 6;
            iArr4[ProtoBuf$Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            f52622b = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            iArr5[ClassKind.CLASS.ordinal()] = 1;
            iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[ClassKind.OBJECT.ordinal()] = 6;
            int[] iArr6 = new int[ProtoBuf$TypeParameter.Variance.values().length];
            iArr6[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
            iArr6[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
            iArr6[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
            f52623c = iArr6;
            int[] iArr7 = new int[ProtoBuf$Type.Argument.Projection.values().length];
            iArr7[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
            iArr7[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
            iArr7[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
            iArr7[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
            f52624d = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            iArr8[Variance.INVARIANT.ordinal()] = 3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Modality m19525a(ProtoBuf$Modality protoBuf$Modality) {
        int i10 = protoBuf$Modality == null ? -1 : a.f52621a[protoBuf$Modality.ordinal()];
        if (i10 == 1) {
            return Modality.FINAL;
        }
        if (i10 == 2) {
            return Modality.OPEN;
        }
        if (i10 != 3) {
            return i10 != 4 ? Modality.FINAL : Modality.SEALED;
        }
        return Modality.ABSTRACT;
    }
}
