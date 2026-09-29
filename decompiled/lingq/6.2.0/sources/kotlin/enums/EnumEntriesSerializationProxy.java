package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Class f47694a;

    public EnumEntriesSerializationProxy(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.f47694a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f47694a.getEnumConstants();
        enumConstants.getClass();
        return new EnumEntriesList((Enum[]) enumConstants);
    }
}
