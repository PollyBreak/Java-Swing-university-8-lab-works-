using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Batova_KA2003_Lr1_СиРешетка
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            float u = float.Parse(textBox1.Text);                     //чтение значения напряжения
            float r = float.Parse(textBox2.Text);                     //чтение значения сопротивления
            float result = u / r;                                     //вычисление значения силы тока по формуле
            label4.Text = "Сила тока = " + result.ToString() + " B";  //вывод полученного результата в лейбл   
        }
    }
}
