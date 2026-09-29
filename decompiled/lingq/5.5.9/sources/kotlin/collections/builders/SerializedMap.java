package kotlin.collections.builders;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m13365d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "readResolve", "<init>", "()V", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: a */
    public Map<?, ?> f38077a;

    public SerializedMap() {
        this(C6753d.m13459L0());
    }

    public SerializedMap(Map<?, ?> map) {
        C5207g.m11111f(map, "map");
        this.f38077a = map;
    }

    private final Object readResolve() {
        return this.f38077a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        C5207g.m11111f(objectInput, "input");
        byte b10 = objectInput.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException(C0166e.m761g("Unsupported flags value: ", b10));
        }
        int i10 = objectInput.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        MapBuilder mapBuilder = new MapBuilder(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapBuilder.put(objectInput.readObject(), objectInput.readObject());
        }
        mapBuilder.m13403b();
        mapBuilder.f38069l = true;
        this.f38077a = mapBuilder;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C5207g.m11111f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f38077a.size());
        for (Map.Entry<?, ?> entry : this.f38077a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
