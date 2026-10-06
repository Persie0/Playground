package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfu implements nfq {

    /* JADX INFO: renamed from: a */
    final DataInput f42201a;

    public nfu(ByteArrayInputStream byteArrayInputStream) {
        this.f42201a = new DataInputStream(byteArrayInputStream);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        try {
            return this.f42201a.readBoolean();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        try {
            return this.f42201a.readByte();
        } catch (EOFException e) {
            throw new IllegalStateException(e);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.io.DataInput
    public final char readChar() {
        try {
            return this.f42201a.readChar();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        try {
            return this.f42201a.readDouble();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        try {
            return this.f42201a.readFloat();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        try {
            return this.f42201a.readInt();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final String readLine() {
        try {
            return this.f42201a.readLine();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final long readLong() {
        try {
            return this.f42201a.readLong();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final short readShort() {
        try {
            return this.f42201a.readShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        try {
            return this.f42201a.readUTF();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        try {
            return this.f42201a.readUnsignedByte();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        try {
            return this.f42201a.readUnsignedShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        try {
            return this.f42201a.skipBytes(i);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        try {
            this.f42201a.readFully(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        try {
            this.f42201a.readFully(bArr, i, i2);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
