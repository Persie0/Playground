package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0225gw implements adc {

    /* JADX INFO: renamed from: j */
    private static final int[] f26546j = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f26547a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0223gu f26548b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f26549c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f26550d;

    /* JADX INFO: renamed from: e */
    CharSequence f26551e;

    /* JADX INFO: renamed from: f */
    Drawable f26552f;

    /* JADX INFO: renamed from: g */
    View f26553g;

    /* JADX INFO: renamed from: h */
    public C0227gy f26554h;

    /* JADX INFO: renamed from: i */
    public boolean f26555i;

    /* JADX INFO: renamed from: k */
    private final Resources f26556k;

    /* JADX INFO: renamed from: l */
    private boolean f26557l;

    /* JADX INFO: renamed from: m */
    private final boolean f26558m;

    /* JADX INFO: renamed from: n */
    private final ArrayList f26559n;

    /* JADX INFO: renamed from: o */
    private boolean f26560o;

    /* JADX INFO: renamed from: p */
    private final ArrayList f26561p;

    /* JADX INFO: renamed from: q */
    private boolean f26562q;

    /* JADX INFO: renamed from: r */
    private int f26563r = 0;

    /* JADX INFO: renamed from: s */
    private boolean f26564s = false;

    /* JADX INFO: renamed from: t */
    private boolean f26565t = false;

    /* JADX INFO: renamed from: u */
    private boolean f26566u = false;

    /* JADX INFO: renamed from: v */
    private boolean f26567v = false;

    /* JADX INFO: renamed from: w */
    private final ArrayList f26568w = new ArrayList();

    /* JADX INFO: renamed from: x */
    private final CopyOnWriteArrayList f26569x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    private boolean f26570y = false;

    public C0225gw(Context context) {
        boolean z = false;
        this.f26547a = context;
        Resources resources = context.getResources();
        this.f26556k = resources;
        this.f26549c = new ArrayList();
        this.f26559n = new ArrayList();
        this.f26560o = true;
        this.f26550d = new ArrayList();
        this.f26561p = new ArrayList();
        this.f26562q = true;
        if (resources.getConfiguration().keyboard != 1 && afs.m556b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f26558m = z;
    }

    /* JADX INFO: renamed from: E */
    private final void m9816E(int i, boolean z) {
        if (i < 0 || i >= this.f26549c.size()) {
            return;
        }
        this.f26549c.remove(i);
        if (z) {
            m9832l(true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9817A(MenuItem menuItem, InterfaceC0239hj interfaceC0239hj, int i) {
        boolean zMo9488f;
        C0227gy c0227gy = (C0227gy) menuItem;
        if (c0227gy == null || !c0227gy.isEnabled()) {
            return false;
        }
        boolean zM9957n = c0227gy.m9957n();
        aej aejVar = c0227gy.f26801o;
        boolean z = aejVar != null && aejVar.mo336c();
        if (c0227gy.m9956m()) {
            zM9957n |= c0227gy.expandActionView();
            if (zM9957n) {
                m9829i(true);
                return true;
            }
        } else if (c0227gy.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m9829i(false);
            }
            if (!c0227gy.hasSubMenu()) {
                c0227gy.m9955l(new SubMenuC0246hq(this.f26547a, this, c0227gy));
            }
            SubMenuC0246hq subMenuC0246hq = c0227gy.f26797k;
            if (z) {
                aejVar.mo335b(subMenuC0246hq);
            }
            if (this.f26569x.isEmpty()) {
                zMo9488f = false;
            } else {
                zMo9488f = interfaceC0239hj != null ? interfaceC0239hj.mo9488f(subMenuC0246hq) : false;
                for (WeakReference weakReference : this.f26569x) {
                    InterfaceC0239hj interfaceC0239hj2 = (InterfaceC0239hj) weakReference.get();
                    if (interfaceC0239hj2 == null) {
                        this.f26569x.remove(weakReference);
                    } else if (!zMo9488f) {
                        zMo9488f = interfaceC0239hj2.mo9488f(subMenuC0246hq);
                    }
                }
            }
            zM9957n |= zMo9488f;
            if (!zM9957n) {
                m9829i(true);
                return false;
            }
        } else if ((i & 1) == 0) {
            m9829i(true);
            return zM9957n;
        }
        return zM9957n;
    }

    /* JADX INFO: renamed from: B */
    final void m9818B() {
        this.f26562q = true;
        m9832l(true);
    }

    /* JADX INFO: renamed from: C */
    final void m9819C() {
        this.f26560o = true;
        m9832l(true);
    }

    /* JADX INFO: renamed from: D */
    public final void m9820D() {
        this.f26563r = 1;
    }

    /* JADX INFO: renamed from: a */
    public C0225gw mo9821a() {
        return this;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m9823c(0, 0, 0, this.f26556k.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f26547a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItemM9823c = m9823c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemM9823c.setIcon(resolveInfo.loadIcon(packageManager));
            ((C0227gy) menuItemM9823c).f26791e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemM9823c;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f26556k.getString(i));
    }

    /* JADX INFO: renamed from: b */
    final C0227gy m9822b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f26568w;
        arrayList.clear();
        m9830j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0227gy) arrayList.get(0);
        }
        boolean zMo9844x = mo9844x();
        for (int i2 = 0; i2 < size; i2++) {
            C0227gy c0227gy = (C0227gy) arrayList.get(i2);
            char c = zMo9844x ? c0227gy.f26794h : c0227gy.f26792f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zMo9844x && c == '\b' && i == 67))) {
                return c0227gy;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    protected final MenuItem m9823c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f26546j[i5] << 16) | ((char) i3);
        C0227gy c0227gy = new C0227gy(this, i, i2, i3, i6, charSequence, this.f26563r);
        ArrayList arrayList = this.f26549c;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i4 = 0;
            }
            arrayList.add(i4, c0227gy);
            m9832l(true);
            return c0227gy;
        } while (((C0227gy) arrayList.get(size)).f26789c > i6);
        i4 = size + 1;
        arrayList.add(i4, c0227gy);
        m9832l(true);
        return c0227gy;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0227gy c0227gy = this.f26554h;
        if (c0227gy != null) {
            mo9840t(c0227gy);
        }
        this.f26549c.clear();
        m9832l(true);
    }

    public final void clearHeader() {
        this.f26552f = null;
        this.f26551e = null;
        this.f26553g = null;
        m9832l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m9829i(true);
    }

    /* JADX INFO: renamed from: d */
    protected String mo9824d() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m9825e() {
        m9831k();
        return this.f26561p;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m9826f() {
        if (!this.f26560o) {
            return this.f26559n;
        }
        this.f26559n.clear();
        int size = this.f26549c.size();
        for (int i = 0; i < size; i++) {
            C0227gy c0227gy = (C0227gy) this.f26549c.get(i);
            if (c0227gy.isVisible()) {
                this.f26559n.add(c0227gy);
            }
        }
        this.f26560o = false;
        this.f26562q = true;
        return this.f26559n;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0227gy c0227gy = (C0227gy) this.f26549c.get(i2);
            if (c0227gy.f26787a == i) {
                return c0227gy;
            }
            if (c0227gy.hasSubMenu() && (menuItemFindItem = c0227gy.f26797k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m9827g(InterfaceC0239hj interfaceC0239hj) {
        m9828h(interfaceC0239hj, this.f26547a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f26549c.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m9828h(InterfaceC0239hj interfaceC0239hj, Context context) {
        this.f26569x.add(new WeakReference(interfaceC0239hj));
        interfaceC0239hj.mo9484b(context, this);
        this.f26562q = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f26555i) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0227gy) this.f26549c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m9829i(boolean z) {
        if (this.f26567v) {
            return;
        }
        this.f26567v = true;
        for (WeakReference weakReference : this.f26569x) {
            InterfaceC0239hj interfaceC0239hj = (InterfaceC0239hj) weakReference.get();
            if (interfaceC0239hj == null) {
                this.f26569x.remove(weakReference);
            } else {
                interfaceC0239hj.mo9485c(this, z);
            }
        }
        this.f26567v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m9822b(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    final void m9830j(List list, int i, KeyEvent keyEvent) {
        boolean zMo9844x = mo9844x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f26549c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0227gy c0227gy = (C0227gy) this.f26549c.get(i2);
                if (c0227gy.hasSubMenu()) {
                    c0227gy.f26797k.m9830j(list, i, keyEvent);
                }
                char c = zMo9844x ? c0227gy.f26794h : c0227gy.f26792f;
                if ((modifiers & 69647) == ((zMo9844x ? c0227gy.f26795i : c0227gy.f26793g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zMo9844x && c == '\b' && i == 67)) && c0227gy.isEnabled())) {
                    list.add(c0227gy);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9831k() {
        ArrayList arrayListM9826f = m9826f();
        if (this.f26562q) {
            boolean zMo9487e = false;
            for (WeakReference weakReference : this.f26569x) {
                InterfaceC0239hj interfaceC0239hj = (InterfaceC0239hj) weakReference.get();
                if (interfaceC0239hj == null) {
                    this.f26569x.remove(weakReference);
                } else {
                    zMo9487e |= interfaceC0239hj.mo9487e();
                }
            }
            if (zMo9487e) {
                this.f26550d.clear();
                this.f26561p.clear();
                int size = arrayListM9826f.size();
                for (int i = 0; i < size; i++) {
                    C0227gy c0227gy = (C0227gy) arrayListM9826f.get(i);
                    if (c0227gy.m9958o()) {
                        this.f26550d.add(c0227gy);
                    } else {
                        this.f26561p.add(c0227gy);
                    }
                }
            } else {
                this.f26550d.clear();
                this.f26561p.clear();
                this.f26561p.addAll(m9826f());
            }
            this.f26562q = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9832l(boolean z) {
        if (this.f26564s) {
            this.f26565t = true;
            if (z) {
                this.f26566u = true;
                return;
            }
            return;
        }
        if (z) {
            this.f26560o = true;
            this.f26562q = true;
        }
        if (this.f26569x.isEmpty()) {
            return;
        }
        m9839s();
        for (WeakReference weakReference : this.f26569x) {
            InterfaceC0239hj interfaceC0239hj = (InterfaceC0239hj) weakReference.get();
            if (interfaceC0239hj == null) {
                this.f26569x.remove(weakReference);
            } else {
                interfaceC0239hj.mo9491i();
            }
        }
        m9838r();
    }

    /* JADX INFO: renamed from: m */
    public final void m9833m(InterfaceC0239hj interfaceC0239hj) {
        for (WeakReference weakReference : this.f26569x) {
            InterfaceC0239hj interfaceC0239hj2 = (InterfaceC0239hj) weakReference.get();
            if (interfaceC0239hj2 == null || interfaceC0239hj2 == interfaceC0239hj) {
                this.f26569x.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9834n(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo9824d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0246hq) item.getSubMenu()).m9834n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: o */
    public final void m9835o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0246hq) item.getSubMenu()).m9835o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo9824d(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo9836p(InterfaceC0223gu interfaceC0223gu) {
        this.f26548b = interfaceC0223gu;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m9846z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0227gy c0227gyM9822b = m9822b(i, keyEvent);
        boolean zM9846z = c0227gyM9822b != null ? m9846z(c0227gyM9822b, i2) : false;
        if ((i2 & 2) != 0) {
            m9829i(true);
        }
        return zM9846z;
    }

    /* JADX INFO: renamed from: r */
    public final void m9838r() {
        this.f26564s = false;
        if (this.f26565t) {
            this.f26565t = false;
            m9832l(this.f26566u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0227gy) this.f26549c.get(i2)).f26788b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f26549c.size() - i2;
            for (int i3 = 0; i3 < size2 && ((C0227gy) this.f26549c.get(i2)).f26788b == i; i3++) {
                m9816E(i2, false);
            }
            m9832l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((C0227gy) this.f26549c.get(i2)).f26787a == i) {
                m9816E(i2, true);
            }
            i2++;
        }
        i2 = -1;
        m9816E(i2, true);
    }

    /* JADX INFO: renamed from: s */
    public final void m9839s() {
        if (this.f26564s) {
            return;
        }
        this.f26564s = true;
        this.f26565t = false;
        this.f26566u = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f26549c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0227gy c0227gy = (C0227gy) this.f26549c.get(i2);
            if (c0227gy.f26788b == i) {
                c0227gy.m9953j(z2);
                c0227gy.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f26570y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f26549c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0227gy c0227gy = (C0227gy) this.f26549c.get(i2);
            if (c0227gy.f26788b == i) {
                c0227gy.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.f26549c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0227gy c0227gy = (C0227gy) this.f26549c.get(i2);
            if (c0227gy.f26788b == i && c0227gy.m9962s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m9832l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f26557l = z;
        m9832l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f26549c.size();
    }

    /* JADX INFO: renamed from: t */
    public boolean mo9840t(C0227gy c0227gy) {
        boolean zMo9489g = false;
        if (this.f26569x.isEmpty() || this.f26554h != c0227gy) {
            return false;
        }
        m9839s();
        for (WeakReference weakReference : this.f26569x) {
            InterfaceC0239hj interfaceC0239hj = (InterfaceC0239hj) weakReference.get();
            if (interfaceC0239hj != null) {
                zMo9489g = interfaceC0239hj.mo9489g(c0227gy);
                if (zMo9489g) {
                    break;
                }
            } else {
                this.f26569x.remove(weakReference);
            }
        }
        m9838r();
        if (zMo9489g) {
            this.f26554h = null;
        }
        return zMo9489g;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo9841u(C0225gw c0225gw, MenuItem menuItem) {
        InterfaceC0223gu interfaceC0223gu = this.f26548b;
        return interfaceC0223gu != null && interfaceC0223gu.mo8241H(c0225gw, menuItem);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo9842v(C0227gy c0227gy) {
        boolean zMo9490h = false;
        if (this.f26569x.isEmpty()) {
            return false;
        }
        m9839s();
        for (WeakReference weakReference : this.f26569x) {
            InterfaceC0239hj interfaceC0239hj = (InterfaceC0239hj) weakReference.get();
            if (interfaceC0239hj != null) {
                zMo9490h = interfaceC0239hj.mo9490h(c0227gy);
                if (zMo9490h) {
                    break;
                }
            } else {
                this.f26569x.remove(weakReference);
            }
        }
        m9838r();
        if (zMo9490h) {
            this.f26554h = c0227gy;
        }
        return zMo9490h;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo9843w() {
        return this.f26570y;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo9844x() {
        return this.f26557l;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo9845y() {
        return this.f26558m;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9846z(MenuItem menuItem, int i) {
        return m9817A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m9823c(i, i2, i3, this.f26556k.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f26556k.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m9823c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0227gy c0227gy = (C0227gy) m9823c(i, i2, i3, charSequence);
        SubMenuC0246hq subMenuC0246hq = new SubMenuC0246hq(this.f26547a, this, c0227gy);
        c0227gy.m9955l(subMenuC0246hq);
        return subMenuC0246hq;
    }

    /* JADX INFO: renamed from: q */
    public final void m9837q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f26556k;
        if (view != null) {
            this.f26553g = view;
            this.f26551e = null;
            this.f26552f = null;
        } else {
            if (i > 0) {
                this.f26551e = resources.getText(i);
            } else if (charSequence != null) {
                this.f26551e = charSequence;
            }
            if (i2 > 0) {
                this.f26552f = abt.m154a(this.f26547a, i2);
            } else if (drawable != null) {
                this.f26552f = drawable;
            }
            this.f26553g = null;
        }
        m9832l(false);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m9823c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
