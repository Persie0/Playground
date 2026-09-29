package p000;

import java.util.Arrays;
import kotlin.AbstractC3192a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class zs2 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final Enum[] f72034a;

    /* JADX INFO: renamed from: b */
    public final cs4 f72035b;

    public zs2(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f72034a = enumArr;
        this.f72035b = AbstractC3192a.m15356a(new C3006fm(7, this, str));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int iMo4084h = decoder.mo4084h(getDescriptor());
        Enum[] enumArr = this.f72034a;
        if (iMo4084h >= 0 && iMo4084h < enumArr.length) {
            return enumArr[iMo4084h];
        }
        throw new SerializationException(iMo4084h + " is not among valid " + getDescriptor().mo3694a() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f72035b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f72034a;
        int iM20844l0 = AbstractC3550rv.m20844l0(enumArr, r5);
        if (iM20844l0 != -1) {
            encoder.mo15614j(getDescriptor(), iM20844l0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo3694a = getDescriptor().mo3694a();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strMo3694a);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo3694a() + '>';
    }
}
