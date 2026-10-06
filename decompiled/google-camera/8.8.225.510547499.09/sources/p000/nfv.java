package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfv implements nfr {

    /* JADX INFO: renamed from: a */
    final DataOutput f42202a;

    public nfv(ByteArrayOutputStream byteArrayOutputStream) {
        this.f42202a = new DataOutputStream(byteArrayOutputStream);
    }

    @Override // java.io.DataOutput
    public final void write(int i) {
        try {
            this.f42202a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        try {
            this.f42202a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        try {
            this.f42202a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) {
        try {
            this.f42202a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        try {
            this.f42202a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        try {
            this.f42202a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        try {
            this.f42202a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        try {
            this.f42202a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        try {
            this.f42202a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        try {
            this.f42202a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        try {
            this.f42202a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        try {
            this.f42202a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) {
        try {
            this.f42202a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f42202a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
