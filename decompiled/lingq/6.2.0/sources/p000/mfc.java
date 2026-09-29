package p000;

import androidx.compose.runtime.internal.C0282a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mfc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51259a = new C0282a(-273373005, false, new wd1(21));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51260b = new C0282a(-1908839913, false, new wd1(22));

    /* JADX INFO: renamed from: a */
    public static final void m16806a(df4 df4Var, KSerializer kSerializer, KSerializer kSerializer2, String str) {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        descriptor.getClass();
        AbstractC3695vr.m23483A(df4Var, descriptor);
        if (eh0.m11129i(descriptor).contains(str)) {
            String strMo3694a = kSerializer.getDescriptor().mo3694a();
            String strMo3694a2 = kSerializer2.getDescriptor().mo3694a();
            throw new JsonEncodingException(AbstractC3393o1.m17738m(ux5.m23000w("Class '", strMo3694a2, "' cannot be serialized ", (df4Var.f35560a.f47132h == ClassDiscriminatorMode.ALL_JSON_OBJECTS && fa4.m11650l(strMo3694a, strMo3694a2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : ux5.m22986i('\'', "as base class '", strMo3694a), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16807b(AbstractC3184kh abstractC3184kh) {
        abstractC3184kh.getClass();
        if (abstractC3184kh instanceof dy8) {
            C3386nv.m17633t("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC3184kh instanceof ak7) {
            C3386nv.m17633t("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC3184kh instanceof vg7) {
            C3386nv.m17633t("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m16808c(df4 df4Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        df4Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof jf4) {
                return ((jf4) annotation).discriminator();
            }
        }
        return df4Var.f35560a.f47130f;
    }
}
