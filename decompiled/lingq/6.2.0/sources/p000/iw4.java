package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface iw4 extends List {
    /* JADX INFO: renamed from: T */
    void mo6553T(ByteString byteString);

    Object getRaw(int i);

    List getUnderlyingElements();

    iw4 getUnmodifiableView();
}
