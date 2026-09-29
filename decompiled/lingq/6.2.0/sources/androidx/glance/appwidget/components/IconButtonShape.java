package androidx.glance.appwidget.components;

import android.os.Build;
import androidx.glance.appwidget.R$dimen;
import androidx.glance.appwidget.R$drawable;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Square' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
final class IconButtonShape {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ IconButtonShape[] $VALUES;
    public static final IconButtonShape Circle;
    public static final IconButtonShape Square;
    private final int cornerRadius;
    private final float defaultSize;
    private final int ripple;
    private final int shape;

    private static final /* synthetic */ IconButtonShape[] $values() {
        return new IconButtonShape[]{Square, Circle};
    }

    static {
        int i = R$drawable.glance_component_btn_square;
        int i2 = R$dimen.glance_component_square_icon_button_corners;
        int i3 = Build.VERSION.SDK_INT;
        Square = new IconButtonShape("Square", 0, i, i2, i3 >= 31 ? 0 : R$drawable.glance_component_square_button_ripple, 60.0f);
        Circle = new IconButtonShape("Circle", 1, R$drawable.glance_component_btn_circle, R$dimen.glance_component_circle_icon_button_corners, i3 < 31 ? R$drawable.glance_component_circle_button_ripple : 0, 48.0f);
        IconButtonShape[] iconButtonShapeArr$values = $values();
        $VALUES = iconButtonShapeArr$values;
        $ENTRIES = AbstractC3201a.m15404a(iconButtonShapeArr$values);
    }

    private IconButtonShape(String str, int i, int i2, int i3, int i4, float f) {
        super(str, i);
        this.shape = i2;
        this.cornerRadius = i3;
        this.ripple = i4;
        this.defaultSize = f;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static IconButtonShape valueOf(String str) {
        return (IconButtonShape) Enum.valueOf(IconButtonShape.class, str);
    }

    public static IconButtonShape[] values() {
        return (IconButtonShape[]) $VALUES.clone();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getDefaultSize-D9Ej5fM, reason: not valid java name */
    public final float m25918getDefaultSizeD9Ej5fM() {
        return this.defaultSize;
    }

    public final int getRipple() {
        return this.ripple;
    }

    public final int getShape() {
        return this.shape;
    }
}
