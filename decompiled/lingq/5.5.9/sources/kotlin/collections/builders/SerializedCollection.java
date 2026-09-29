package kotlin.collections.builders;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import p260m8.C7499b;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m13365d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "readResolve", "<init>", "()V", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SerializedCollection implements Externalizable {

    /* JADX INFO: renamed from: a */
    public Collection<?> f38075a;

    /* JADX INFO: renamed from: b */
    public final int f38076b;

    public SerializedCollection() {
        this(0, EmptyList.f38032a);
    }

    public SerializedCollection(int i10, Collection collection) {
        C5207g.m11111f(collection, "collection");
        this.f38075a = collection;
        this.f38076b = i10;
    }

    private final Object readResolve() {
        return this.f38075a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection<?> collection;
        C5207g.m11111f(objectInput, "input");
        byte b10 = objectInput.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = objectInput.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            ListBuilder listBuilder = new ListBuilder(i11);
            while (i12 < i11) {
                listBuilder.add(objectInput.readObject());
                i12++;
            }
            C9000b.m17239e(listBuilder);
            collection = listBuilder;
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(i11));
            while (i12 < i11) {
                setBuilder.add(objectInput.readObject());
                i12++;
            }
            C7499b.m14940g(setBuilder);
            collection = setBuilder;
        }
        this.f38075a = collection;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C5207g.m11111f(objectOutput, "output");
        objectOutput.writeByte(this.f38076b);
        objectOutput.writeInt(this.f38075a.size());
        Iterator<?> it = this.f38075a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
