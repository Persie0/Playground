package p000;

import com.google.protobuf.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface jw4 extends List {
    Object getRaw(int i);

    List getUnderlyingElements();

    jw4 getUnmodifiableView();

    /* JADX INFO: renamed from: u */
    void mo6818u(ByteString byteString);
}
