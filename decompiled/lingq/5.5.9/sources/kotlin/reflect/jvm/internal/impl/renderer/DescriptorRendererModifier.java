package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;

/* JADX INFO: loaded from: classes2.dex */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<DescriptorRendererModifier> ALL;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final C7006a Companion = new Object() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.a
    };
    private final boolean includeByDefault;

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$a] */
    static {
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = C6752c.m13457y0(arrayList);
        ALL = C6744b.m13393y0(values());
    }

    DescriptorRendererModifier(boolean z10) {
        this.includeByDefault = z10;
    }
}
